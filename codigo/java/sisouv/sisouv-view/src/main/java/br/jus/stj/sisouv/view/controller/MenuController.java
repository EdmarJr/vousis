package br.jus.stj.sisouv.view.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import org.primefaces.event.NodeSelectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

import br.jus.stj.sisouv.entity.vo.LinkVO;

@ManagedBean
@ViewScoped
public class MenuController extends GenericController {

	private static final long serialVersionUID = 1L;
	
	private static String ROOT = "Root";
	
	private TreeNode lastNodeSelecionado;

	private MenuModel menuModel;

	private TreeNode root;

	public TreeNode getRoot() {
		return root;
	}

	@PostConstruct
	private void init() {

		carregarTreeNode();
		
		menuModel = new DefaultMenuModel();
		DefaultSubMenu defaultSubMenu = criarSubMenu("Manifestações");
		DefaultSubMenu defaultSubMenu1 = criarSubMenu("Manifestações1");

		defaultSubMenu.addElement(defaultSubMenu1);
		DefaultMenuItem defaultMenuItem = criarMenuItem("Cadastrar",
				"/teste.jsf", "ui-icon-home");
		DefaultMenuItem defaultMenuItem1 = criarMenuItem("Cadastrar1",
				"/teste.jsf1", "ui-icon-home1");
		adicionarElemento(defaultSubMenu1, defaultMenuItem1);
		adicionarElemento(defaultSubMenu, defaultMenuItem);
		adicionarElemento(menuModel, defaultSubMenu);

	}

	private void carregarTreeNode() {

		root = new DefaultTreeNode("Root", null);
		TreeNode node0 = new DefaultTreeNode("Node 0", root);
		TreeNode node1 = new DefaultTreeNode("Node 1", root);
		TreeNode node00 = new DefaultTreeNode("Node 0.0", node0);
		TreeNode node01 = new DefaultTreeNode("Node 0.1", node0);

		TreeNode node010 = new DefaultTreeNode("Node 1.0", node1);

		DefaultTreeNode node011 = new DefaultTreeNode(new LinkVO("Node 1.1",
				"caminho4"), node1);

		DefaultTreeNode node000 = new DefaultTreeNode(new LinkVO("Node 0.0.0",
				"caminho3"), node00);

		DefaultTreeNode node001 = new DefaultTreeNode(new LinkVO("Node 0.0.1",
				"caminho2"), node00);

		DefaultTreeNode node0010 = new DefaultTreeNode(new LinkVO("Node 0.1.0",
				"/faces/logado/manifestacao/manifestacao.jsf"), node01);

	}

	private DefaultMenuItem criarMenuItem(String nomeLabel, String nomeUrl,
			String icone) {

		DefaultMenuItem defaultMenuItem = new DefaultMenuItem(nomeLabel);
		defaultMenuItem.setUrl(nomeUrl);
		defaultMenuItem.setIcon(icone);

		return defaultMenuItem;

	}

	private DefaultSubMenu criarSubMenu(String label) {

		return new DefaultSubMenu("Manifestações");

	}

	private void adicionarElemento(MenuModel defaultMenuModel,
			DefaultSubMenu defaultSubMenu) {

		defaultMenuModel.addElement(defaultSubMenu);

	}

	private void adicionarElemento(DefaultSubMenu defaultSubMenu,
			DefaultMenuItem defaultMenuItem) {

		defaultSubMenu.addElement(defaultMenuItem);

	}

	public MenuModel getMenuModel() {
		return menuModel;
	}

	public void setMenuModel(MenuModel menuModel) {
		this.menuModel = menuModel;
	}

	public void onNodeSelect(NodeSelectEvent e) {
		
		LinkVO linkVO = null;
		TreeNode node = e.getTreeNode();
		
		try {
			
			linkVO = (LinkVO) node.getData();
			
		} catch (Exception ex) {
			
			setMenuExpanded(node);
			
		}
		
		if(linkVO != null)
			redirect(linkVO.getAcao());
		
	}
	
	private void setMenuExpanded(TreeNode node) {
		
		TreeNode nodeParent = node;

		node.setExpanded(true);
		
		while (nodeParent.getParent() != null
				&& !nodeParent.getParent().getData().equals(ROOT)) {
			
			nodeParent = nodeParent.getParent();
			nodeParent.setExpanded(true);
			
		}

	}
	
	
	public void setSelected(TreeNode node) {
		
		node.setSelected(true);
		
	}

	public String getCaminhoPagina(TreeNode node) {

		return (String) node.getData();

	}

}
