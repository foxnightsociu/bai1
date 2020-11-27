package Test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChuyenView {
	private JPanel jpnRoot;
	private String kindSelected = "";
	private List<DanhMuc> listDanhMuc;

	public ChuyenView(JPanel jpnRoot) {
		super();
		this.jpnRoot = jpnRoot;
	}

	public void setDashboard(JPanel jpnItem, JLabel jlbItem) {
		kindSelected = "TrangChinh";
		jpnItem.setBackground(new Color(96, 100, 191));
		jlbItem.setBackground(new Color(96, 100, 191));
		JPanel node = new ManHinhChinh();
		jpnRoot.removeAll();
		jpnRoot.setLayout(new BorderLayout());
		jpnRoot.add(node);
		jpnRoot.validate();
		jpnRoot.repaint();
	}

	public void setEvent(List<DanhMuc> listDanhMuc) {
		this.listDanhMuc = listDanhMuc;
		for (DanhMuc item : listDanhMuc) {
			item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
		}
	}

	class LabelEvent implements MouseListener {

		private JPanel node;
		private String kind;

		private JPanel jpnItem;
		private JLabel jlbItem;

		public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
			this.kind = kind;
			this.jpnItem = jpnItem;
			this.jlbItem = jlbItem;
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			switch (kind) {
			case "TrangChinh":
				node = new ManHinhChinh();
				break;
			case "HocVien":
				node = new HocVien();
				break;
			case "KhoaHoc":
				node = new KhoaHoc();
				// more
			default:
				break;
			}
			jpnRoot.removeAll();
			jpnRoot.setLayout(new BorderLayout());
			jpnRoot.add(node);
			jpnRoot.validate();
			jpnRoot.repaint();
			setChangeBackgroud(kind);
		}
		@Override
		public void mousePressed(MouseEvent e) {
			kindSelected = kind;
			jpnItem.setBackground(new Color(96, 100, 191));
			jlbItem.setBackground(new Color(96, 100, 191));
		}
		@Override
		public void mouseReleased(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			jpnItem.setBackground(new Color(96, 100, 191));
			jlbItem.setBackground(new Color(96, 100, 191));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (!kindSelected.equalsIgnoreCase(kind)) {
				jpnItem.setBackground(new Color(76, 175, 80));
				jlbItem.setBackground(new Color(76, 175, 80));
			}
		}

	}

	public void setChangeBackgroud(String kind) {
		for (DanhMuc item : listDanhMuc) {
			if (item.getKind().equalsIgnoreCase(kind)) {
				item.getJpn().setBackground(new Color(96, 100, 191));
				item.getJlb().setBackground(new Color(96, 100, 191));
			} else {
				item.getJpn().setBackground(new Color(76, 175, 80));
				item.getJlb().setBackground(new Color(76, 175, 80));
			}
		}
	}
}
