package swing;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddressBook extends JFrame {
	// �÷� �̸� �迭
	String[] columns = { "�̸�", "��ȭ��ȣ", "�ּ�" };
	// ������ �迭
	String[][] data = { { "������", "01099648755", "����� ����" }, { "�߼Ҷ�", "01031390871", "��õ�� �߱�" },
			{ "������", "01044460880", "����� ���빮��" } };

	public AddressBook() {
		setBounds(400, 400, 1000, 400);
		setTitle("����ó");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// ���̺�� �����
		DefaultTableModel model = new DefaultTableModel(data, columns);
		// ���̺� ���� �̿��ؼ� ���̺� �����
		JTable table = new JTable(model);
		// table.setModel(model);
		// ��� ������ ũ�⺸�� table�� Ŀ������ ��ũ�� �ٸ� �̿��� �� �ֵ��� Scroll�� ����
		JScrollPane scrollPane = new JScrollPane(table);
		// ��ũ�� ������ �����ӿ� ����
		add(scrollPane);

		// �޴��ٸ� ����
		JMenuBar menuBar = new JMenuBar();

		JMenu file = new JMenu("����(a)");
		// ����Ű ����
		file.setMnemonic('a');// ART+a ������ �޴��� ����

		JMenuItem item1 = new JMenuItem("����");
		file.add(item1);

		JCheckBoxMenuItem item2 = new JCheckBoxMenuItem("����");
		file.add(item2);

		JRadioButtonMenuItem item3 = new JRadioButtonMenuItem("����");
		file.add(item3);

		menuBar.add(file);

		// �޴��ٸ� �����쿡 ����
		setJMenuBar(menuBar);

		JLabel lblName = new JLabel("�̸�");
		JTextField tfName = new JTextField(10);
		JLabel lblPhone = new JLabel("��ȭ��ȣ");
		JTextField tfPhone = new JTextField(15);
		JLabel lblAddress = new JLabel("�ּ�");
		JTextField tfAddress = new JTextField(30);

		JButton btnInsert = new JButton("����");
		JButton btnDelete = new JButton("����");

		JPanel southPanel = new JPanel();
		southPanel.add(lblName);
		southPanel.add(tfName);
		southPanel.add(lblPhone);
		southPanel.add(tfPhone);
		southPanel.add(lblAddress);
		southPanel.add(tfAddress);
		southPanel.add(btnInsert);
		southPanel.add(btnDelete);

		add("South", southPanel);

		setVisible(true);

		// ���Թ�ư�� Ŭ�� �̺�Ʈ(ActionListener) ó��
		ActionListener insertListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �ؽ�Ʈ�ʵ忡 �Էµ� ���� ��������
				String name = tfName.getText();
				String phone = tfPhone.getText();
				String address = tfAddress.getText();

				// �¿� ���� �����ϱ�
				name = name.trim();
				phone = phone.trim();
				address = address.trim();

				// name�� �ʼ� �Է�
				// �̸��� �Էµ��� ���� ��� ���̰� 0�̴�. (null�� �ƴϴ�!!!!!)
				if (name.length() == 0) {
					JOptionPane.showMessageDialog(null, "�̸��� �ʼ� �Է� �����Դϴ�.", "�̸�", JOptionPane.WARNING_MESSAGE);
					// �Ʒ����� �� �̻� �������� �ʵ��� ����
					return;
				}

				// ���̺��� �����͸� �����ϱ� ���ؼ� ���̺��� ������ ���� �����´�.
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				// �����͸� �߰��ϱ� ���ؼ� �߰��� ������ �迭�� ����
				String[] row = { name, phone, address };
				// �𵨿� �߰�
				model.addRow(row);
				// ���̺� ����
				table.updateUI();
				
				//�ؽ�Ʈ �ʵ� Ŭ����
				tfName.setText("");
				tfPhone.setText("");
				tfAddress.setText("");
				
				//�޽��� �ڽ� ���
				JOptionPane.showMessageDialog(null, "������ ���� ����.", "�����۾�", JOptionPane.PLAIN_MESSAGE);
			}
		};
		btnInsert.addActionListener(insertListener);

		
		// ���� ��ư�� Ŭ�� �̺�Ʈ ó��
		ActionListener deleteListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//������ �� ��ȣ ã��
				int idx = table.getSelectedRow();
				//���̺��� ���� �������� �ʾҴٸ�
				if(idx>=table.getRowCount()||idx<0) {
					JOptionPane.showMessageDialog(null, "������ ���� �����ϼ���.", "���� ����", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				//���̺��� �� ��������
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				//������ �࿡ �ش��ϴ� ������ �����
				model.removeRow(idx);
				table.updateUI();
				JOptionPane.showMessageDialog(null, "������ ���� ����.", "����", JOptionPane.WARNING_MESSAGE);
			}
		};
		btnDelete.addActionListener(deleteListener);
		
		
		
		// �޽��� ���̾�α� ���
		// JOptionPane.showMessageDialog(null, "�޽��� ���̾�α�", "��ȭ ����",
		// JOptionPane.QUESTION_MESSAGE);
		// ���� ���̾�α� ���
//		int r = JOptionPane.showConfirmDialog(null, "���� ���̾�α�", "��ȭ ����", JOptionPane.YES_NO_OPTION);
//		System.out.println(r);//���� ������ 0, �ƴϿ� ������ 1�� ����
		// ��ǲ ���̾�α� ���
//		String r = JOptionPane.showInputDialog(null, "�޽��� ���̾�α�", "��ȭ ����", JOptionPane.YES_NO_OPTION);
//		System.out.println(r);

	}
}
