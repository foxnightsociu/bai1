package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MainFlame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFlame frame = new MainFlame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFlame() {
		setResizable(false);
		setTitle("Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(Color.LIGHT_GRAY);
		panelMenu.setBounds(10, 11, 219, 384);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 219, 67);
		panelMenu.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("QU\u1EA2N L\u00DD H\u1ECCC VI\u00CAN");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(61, 11, 148, 34);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\2x\\outline_color_lens_white_18dp.png"));
		lblNewLabel_2.setBounds(5, 11, 46, 45);
		panel.add(lblNewLabel_2);

		JPanel jpnTrangChu = new JPanel();
		jpnTrangChu.setBackground(Color.GREEN);
		jpnTrangChu.setBounds(10, 81, 199, 61);
		panelMenu.add(jpnTrangChu);
		jpnTrangChu.setLayout(null);

		JLabel jlbTrangChu = new JLabel("M\u00E0n h\u00ECnh ch\u00EDnh");
		jlbTrangChu.setForeground(Color.WHITE);
		jlbTrangChu.setFont(new Font("Times New Roman", Font.BOLD, 14));
		jlbTrangChu.setBounds(54, 11, 138, 39);
		jpnTrangChu.add(jlbTrangChu);

		JPanel jpnHocVien = new JPanel();
		jpnHocVien.setBackground(Color.GREEN);
		jpnHocVien.setBounds(10, 155, 199, 56);
		panelMenu.add(jpnHocVien);
		jpnHocVien.setLayout(null);

		JLabel jlbHocVien = new JLabel("Qu\u1EA3n l\u00FD h\u1ECDc vi\u00EAn");
		jlbHocVien.setForeground(Color.WHITE);
		jlbHocVien.setFont(new Font("Times New Roman", Font.BOLD, 14));
		jlbHocVien.setBounds(58, 11, 134, 34);
		jpnHocVien.add(jlbHocVien);

		JPanel jpnKhoaHoc = new JPanel();
		jpnKhoaHoc.setBackground(Color.GREEN);
		jpnKhoaHoc.setBounds(10, 222, 199, 61);
		panelMenu.add(jpnKhoaHoc);
		jpnKhoaHoc.setLayout(null);

		JLabel jlbKhoaHoc = new JLabel("Qu\u1EA3n l\u00FD kh\u00F3a h\u1ECDc");
		jlbKhoaHoc.setForeground(Color.WHITE);
		jlbKhoaHoc.setFont(new Font("Times New Roman", Font.BOLD, 14));
		jlbKhoaHoc.setBounds(50, 11, 142, 39);
		jpnKhoaHoc.add(jlbKhoaHoc);

		JPanel panelView = new JPanel();
		panelView.setBackground(Color.LIGHT_GRAY);
		panelView.setBounds(239, 11, 363, 384);
		contentPane.add(panelView);
		panelView.setLayout(null);

		List<DanhMuc> listDanhMuc = new ArrayList<>();
		listDanhMuc.add(new DanhMuc("TrangChinh", jpnTrangChu, jlbTrangChu));
		listDanhMuc.add(new DanhMuc("HocVien", jpnHocVien, jlbHocVien));
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\2x\\outline_people_outline_white_18dp.png"));
		lblNewLabel_1_1.setBounds(14, 11, 34, 39);
		jpnHocVien.add(lblNewLabel_1_1);
		listDanhMuc.add(new DanhMuc("KhoaHoc", jpnKhoaHoc, jlbKhoaHoc));
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\2x\\outline_assignment_white_18dp.png"));
		lblNewLabel_1_2.setBounds(10, 11, 34, 39);
		jpnKhoaHoc.add(lblNewLabel_1_2);

		ChuyenView controller = new ChuyenView(panelView);
		controller.setDashboard(jpnTrangChu, jlbTrangChu);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\2x\\outline_cast_for_education_white_18dp.png"));
		lblNewLabel_1.setBounds(10, 11, 34, 39);
		jpnTrangChu.add(lblNewLabel_1);
		controller.setEvent(listDanhMuc);
	}

}
