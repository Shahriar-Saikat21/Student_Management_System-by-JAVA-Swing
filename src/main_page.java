import java.sql.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class main_page extends javax.swing.JFrame {

    Color defaultColor,clickedColor;
    
    public main_page() {
        initComponents();
        
        defaultColor = new Color(153,153,255);
        clickedColor = new Color(51,51,255);
        
        profileTab.setBackground(clickedColor);
        resultTab.setBackground(defaultColor);
        queriesTab.setBackground(defaultColor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        profileTab = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        resultTab = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        queriesTab = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        dashboardTabPanel = new javax.swing.JTabbedPane();
        profilePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        genderBOX = new javax.swing.JComboBox<>();
        deptBOX = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        resetBTN = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        profileSearchBTN = new javax.swing.JButton();
        resultPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        resultIdTF = new javax.swing.JTextField();
        resultSearchBTN = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        currentCGPATF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        completedCreditTF = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        resultUpdateBTN = new javax.swing.JButton();
        resultResetBTN = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        gpaTF = new javax.swing.JTextField();
        creditTF = new javax.swing.JTextField();
        queriesPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        queryIDTF = new javax.swing.JTextField();
        querySearchBTN = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("Student Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(227, 227, 227))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 100));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        profileTab.setBackground(new java.awt.Color(153, 153, 255));
        profileTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileTabMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Profile Create");

        javax.swing.GroupLayout profileTabLayout = new javax.swing.GroupLayout(profileTab);
        profileTab.setLayout(profileTabLayout);
        profileTabLayout.setHorizontalGroup(
            profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileTabLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        profileTabLayout.setVerticalGroup(
            profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        resultTab.setBackground(new java.awt.Color(153, 153, 255));
        resultTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultTabMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Result Update");

        javax.swing.GroupLayout resultTabLayout = new javax.swing.GroupLayout(resultTab);
        resultTab.setLayout(resultTabLayout);
        resultTabLayout.setHorizontalGroup(
            resultTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultTabLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resultTabLayout.setVerticalGroup(
            resultTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        queriesTab.setBackground(new java.awt.Color(153, 153, 255));
        queriesTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                queriesTabMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Queries");

        javax.swing.GroupLayout queriesTabLayout = new javax.swing.GroupLayout(queriesTab);
        queriesTab.setLayout(queriesTabLayout);
        queriesTabLayout.setHorizontalGroup(
            queriesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queriesTabLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        queriesTabLayout.setVerticalGroup(
            queriesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queriesTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profileTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(resultTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(queriesTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(profileTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(queriesTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 160, 600));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Student ID");

        idTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        nameTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Gender");

        genderBOX.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        genderBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        deptBOX.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deptBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "EEE", "BBA", "Civil" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("Department");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setText("Email");

        emailTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        phoneTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("Contact No");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setText("Address");

        addressTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        addBTN.setBackground(new java.awt.Color(51, 204, 0));
        addBTN.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        addBTN.setForeground(new java.awt.Color(255, 255, 255));
        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        updateBTN.setBackground(new java.awt.Color(51, 153, 255));
        updateBTN.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        updateBTN.setForeground(new java.awt.Color(255, 255, 255));
        updateBTN.setText("Update");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        deleteBTN.setBackground(new java.awt.Color(255, 51, 0));
        deleteBTN.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        deleteBTN.setForeground(new java.awt.Color(255, 255, 255));
        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        resetBTN.setBackground(new java.awt.Color(153, 153, 255));
        resetBTN.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        resetBTN.setForeground(new java.awt.Color(255, 255, 255));
        resetBTN.setText("Reset");
        resetBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBTNActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel12.setText("Search ");

        searchTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Department", "Email", "Contact No", "Address", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentTable);

        profileSearchBTN.setBackground(new java.awt.Color(153, 153, 255));
        profileSearchBTN.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        profileSearchBTN.setForeground(new java.awt.Color(255, 255, 255));
        profileSearchBTN.setText("Search");
        profileSearchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileSearchBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(profileSearchBTN))
                    .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(profilePanelLayout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(genderBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deptBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(profilePanelLayout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(profilePanelLayout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(profilePanelLayout.createSequentialGroup()
                            .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addressTF)
                                .addGroup(profilePanelLayout.createSequentialGroup()
                                    .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(profilePanelLayout.createSequentialGroup()
                                            .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(49, 49, 49)
                                            .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(49, 49, 49)
                                            .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(48, 48, 48)
                                            .addComponent(resetBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addGap(66, 66, 66))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameTF)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(genderBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deptBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(phoneTF)
                        .addGap(85, 85, 85))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profileSearchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(441, 441, 441))
        );

        dashboardTabPanel.addTab("tab1", profilePanel);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel13.setText("Student ID");

        resultIdTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        resultSearchBTN.setBackground(new java.awt.Color(102, 102, 255));
        resultSearchBTN.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        resultSearchBTN.setForeground(new java.awt.Color(255, 255, 255));
        resultSearchBTN.setText("Search");
        resultSearchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultSearchBTNActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel14.setText("Current CGPA");

        currentCGPATF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel15.setText("Completed Credit");

        completedCreditTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel16.setText("Update Result");

        resultUpdateBTN.setBackground(new java.awt.Color(0, 204, 51));
        resultUpdateBTN.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        resultUpdateBTN.setForeground(new java.awt.Color(255, 255, 255));
        resultUpdateBTN.setText("Update");
        resultUpdateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultUpdateBTNActionPerformed(evt);
            }
        });

        resultResetBTN.setBackground(new java.awt.Color(102, 102, 255));
        resultResetBTN.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        resultResetBTN.setForeground(new java.awt.Color(255, 255, 255));
        resultResetBTN.setText("Reset");
        resultResetBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultResetBTNActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel18.setText("Running Trimester GPA");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel19.setText("Running Trimester Completed Credit");

        gpaTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        creditTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultPanelLayout.createSequentialGroup()
                        .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creditTF, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(resultPanelLayout.createSequentialGroup()
                        .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resultIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentCGPATF, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(completedCreditTF, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(resultSearchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(378, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultResetBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultUpdateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(367, 367, 367))
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultSearchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentCGPATF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completedCreditTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(gpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(creditTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultUpdateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultResetBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        dashboardTabPanel.addTab("tab2", resultPanel);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel17.setText("Student ID");

        queryIDTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        querySearchBTN.setBackground(new java.awt.Color(102, 102, 255));
        querySearchBTN.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        querySearchBTN.setForeground(new java.awt.Color(255, 255, 255));
        querySearchBTN.setText("Search");

        display.setColumns(20);
        display.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        display.setRows(5);
        jScrollPane3.setViewportView(display);

        javax.swing.GroupLayout queriesPanelLayout = new javax.swing.GroupLayout(queriesPanel);
        queriesPanel.setLayout(queriesPanelLayout);
        queriesPanelLayout.setHorizontalGroup(
            queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queriesPanelLayout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(queriesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(queryIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(querySearchBTN)))
                .addGap(256, 256, 256))
        );
        queriesPanelLayout.setVerticalGroup(
            queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queriesPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(queryIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(querySearchBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        dashboardTabPanel.addTab("tab3", queriesPanel);

        getContentPane().add(dashboardTabPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 1040, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileTabMouseClicked
        dashboardTabPanel.setSelectedIndex(0);
        profileTab.setBackground(clickedColor);
        resultTab.setBackground(defaultColor);
        queriesTab.setBackground(defaultColor);
    }//GEN-LAST:event_profileTabMouseClicked

    private void resultTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultTabMouseClicked
        dashboardTabPanel.setSelectedIndex(1);
        profileTab.setBackground(defaultColor);
        resultTab.setBackground(clickedColor);
        queriesTab.setBackground(defaultColor);
    }//GEN-LAST:event_resultTabMouseClicked

    private void queriesTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_queriesTabMouseClicked
        dashboardTabPanel.setSelectedIndex(2); 
        profileTab.setBackground(defaultColor);
        resultTab.setBackground(defaultColor);
        queriesTab.setBackground(clickedColor);
    }//GEN-LAST:event_queriesTabMouseClicked

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        try{
            Connection DBConnection = DatabaseConnection.connectDB();
            
            String id = idTF.getText();
            String name = nameTF.getText();
            String gender = genderBOX.getItemAt(genderBOX.getSelectedIndex());
            String dept = deptBOX.getItemAt(deptBOX.getSelectedIndex());
            String email = emailTF.getText();
            String contact = phoneTF.getText();
            String address = addressTF.getText();

            String query = "UPDATE student_info SET name = ?,gender = ?, dept = ?, mail = ?,contactNum = ?,address = ? WHERE id = ?";
            PreparedStatement statement = DBConnection.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, gender);
            statement.setString(3, dept);
            statement.setString(4, email);
            statement.setString(5, contact);
            statement.setString(6, address);
            statement.setString(7, id);
            int option = JOptionPane.showConfirmDialog(null, "Are You Sure ??");
            if(option == JOptionPane.YES_OPTION){
                statement.executeUpdate();
                idTF.setText("");
                nameTF.setText("");
                genderBOX.setSelectedIndex(0);
                deptBOX.setSelectedIndex(0);
                emailTF.setText("");
                phoneTF.setText("");
                addressTF.setText("");
                JOptionPane.showMessageDialog(null, "Record has been updated successfully");
            }else if(option == JOptionPane.CANCEL_OPTION){
                idTF.setText("");
                nameTF.setText("");
                genderBOX.setSelectedIndex(0);
                deptBOX.setSelectedIndex(0);
                emailTF.setText("");
                phoneTF.setText("");
                addressTF.setText("");
            } 
            
            DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
            model.setValueAt("", 0, 0);
            model.setValueAt("", 0, 1);
            model.setValueAt("", 0, 2);
            model.setValueAt("", 0, 3);
            model.setValueAt("", 0, 4);
            model.setValueAt("", 0, 5);
            model.setValueAt("", 0, 6);
                       
            DBConnection.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_updateBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        try{
            Connection DBConnection = DatabaseConnection.connectDB();
            
            String id = idTF.getText();            

            String query = "DELETE FROM student_info WHERE id = ?";
            PreparedStatement statement = DBConnection.prepareStatement(query);
            statement.setString(1, id);
            
            String queryTwo = "DELETE FROM student_result WHERE id = ?";
            PreparedStatement statementTwo = DBConnection.prepareStatement(queryTwo);
            statementTwo.setString(1, id);

            int option = JOptionPane.showConfirmDialog(null, "Are You Sure ??");
            if(option == JOptionPane.YES_OPTION){
                statement.executeUpdate();
                statementTwo.executeUpdate();
                idTF.setText("");
                nameTF.setText("");
                genderBOX.setSelectedIndex(0);
                deptBOX.setSelectedIndex(0);
                emailTF.setText("");
                phoneTF.setText("");
                addressTF.setText("");
                JOptionPane.showMessageDialog(null, "Record has been deleted successfully");
            }else if(option == JOptionPane.CANCEL_OPTION){
                idTF.setText("");
                nameTF.setText("");
                genderBOX.setSelectedIndex(0);
                deptBOX.setSelectedIndex(0);
                emailTF.setText("");
                phoneTF.setText("");
                addressTF.setText("");
            }  
            
            DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
            model.setValueAt("", 0, 0);
            model.setValueAt("", 0, 1);
            model.setValueAt("", 0, 2);
            model.setValueAt("", 0, 3);
            model.setValueAt("", 0, 4);
            model.setValueAt("", 0, 5);
            model.setValueAt("", 0, 6);
                       
            DBConnection.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void resetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBTNActionPerformed
        idTF.setText("");
        nameTF.setText("");
        genderBOX.setSelectedIndex(0);
        deptBOX.setSelectedIndex(0);
        emailTF.setText("");
        phoneTF.setText("");
        addressTF.setText("");
        searchTF.setText("");
        
        DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
        model.setValueAt("", 0, 0);
        model.setValueAt("", 0, 1);
        model.setValueAt("", 0, 2);
        model.setValueAt("", 0, 3);
        model.setValueAt("", 0, 4);
        model.setValueAt("", 0, 5);
        model.setValueAt("", 0, 6);
    }//GEN-LAST:event_resetBTNActionPerformed

    private void resultSearchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultSearchBTNActionPerformed
        try{
            Connection DBConnection = DatabaseConnection.connectDB();
            
            String searchID = resultIdTF.getText();
            
            String query = "SELECT cgpa,credit FROM student_result WHERE id = ?";
            PreparedStatement statement = DBConnection.prepareStatement(query);
            statement.setString(1, searchID);
            ResultSet result = statement.executeQuery();
            
            if(result.next()==false){
                JOptionPane.showMessageDialog(null, "Record is not found");
                resultIdTF.setText("");
                currentCGPATF.setText("");
                completedCreditTF.setText("");
            }else{
                currentCGPATF.setText(result.getString("cgpa"));
                completedCreditTF.setText(result.getString("credit"));
            }
            
            DBConnection.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_resultSearchBTNActionPerformed

    private void resultUpdateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultUpdateBTNActionPerformed
        try{
            Connection DBConnection = DatabaseConnection.connectDB();
            
            String id = resultIdTF.getText();
            double cgpa = Double.parseDouble(currentCGPATF.getText());
            double completeCredit = Double.parseDouble(completedCreditTF.getText());
            double gpa = Double.parseDouble(gpaTF.getText());
            double credit = Double.parseDouble(creditTF.getText());
            
            double newCompletedCredit = completeCredit+credit;
            double newCGPA = ((cgpa*completeCredit)+(gpa*credit))/(completeCredit+credit);

            String query = "UPDATE student_result SET cgpa = ?,credit = ? WHERE id = ?";
            PreparedStatement statement = DBConnection.prepareStatement(query);
            statement.setString(1, String.format("%.2f",newCGPA));
            statement.setString(2, newCompletedCredit+"");
            statement.setString(3, id);
            
            int option = JOptionPane.showConfirmDialog(null, "Are You Sure ??");
            if(option == JOptionPane.YES_OPTION){
                statement.executeUpdate();
                resultIdTF.setText("");
                currentCGPATF.setText("");
                completedCreditTF.setText("");
                gpaTF.setText("");
                creditTF.setText("");
                JOptionPane.showMessageDialog(null, "Result has been updated successfully");
            }else if(option == JOptionPane.CANCEL_OPTION){
                resultIdTF.setText("");
                currentCGPATF.setText("");
                completedCreditTF.setText("");
                gpaTF.setText("");
                creditTF.setText("");
            } 
                       
            DBConnection.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_resultUpdateBTNActionPerformed

    private void resultResetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultResetBTNActionPerformed
        resultIdTF.setText("");
        currentCGPATF.setText("");
        completedCreditTF.setText("");
        gpaTF.setText("");
        creditTF.setText("");
    }//GEN-LAST:event_resultResetBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        try{
            Connection DBConnection = DatabaseConnection.connectDB();

            String id = idTF.getText();
            String name = nameTF.getText();
            String gender = genderBOX.getItemAt(genderBOX.getSelectedIndex());
            String dept = deptBOX.getItemAt(deptBOX.getSelectedIndex());
            String email = emailTF.getText();
            String contact = phoneTF.getText();
            String address = addressTF.getText();

            String query = "INSERT INTO student_info(id,name,gender,dept,mail,contactNum,address) values(?,?,?,?,?,?,?)";
            PreparedStatement statement = DBConnection.prepareStatement(query);
            statement.setString(1, id);
            statement.setString(2, name);
            statement.setString(3, gender);
            statement.setString(4, dept);
            statement.setString(5, email);
            statement.setString(6, contact);
            statement.setString(7, address);
            
            String queryTwo = "INSERT INTO student_result(id,cgpa,credit) values(?,?,?)";
            PreparedStatement statementTwo = DBConnection.prepareStatement(queryTwo);
            statementTwo.setString(1, id);
            statementTwo.setString(2, "0.00");
            statementTwo.setString(3, "0.00");
            
            int option = JOptionPane.showConfirmDialog(null, "Are You Sure ??");
            if(option == JOptionPane.YES_OPTION){
                statement.executeUpdate();
                statementTwo.executeUpdate();
                idTF.setText("");
                nameTF.setText("");
                genderBOX.setSelectedIndex(0);
                deptBOX.setSelectedIndex(0);
                emailTF.setText("");
                phoneTF.setText("");
                addressTF.setText("");
                JOptionPane.showMessageDialog(null, "Profile has been created successfully");
            }else if(option == JOptionPane.CANCEL_OPTION){
                idTF.setText("");
                nameTF.setText("");
                genderBOX.setSelectedIndex(0);
                deptBOX.setSelectedIndex(0);
                emailTF.setText("");
                phoneTF.setText("");
                addressTF.setText("");
            } 
            
            DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
            model.setValueAt("", 0, 0);
            model.setValueAt("", 0, 1);
            model.setValueAt("", 0, 2);
            model.setValueAt("", 0, 3);
            model.setValueAt("", 0, 4);
            model.setValueAt("", 0, 5);
            model.setValueAt("", 0, 6);
            
            DBConnection.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }//GEN-LAST:event_addBTNActionPerformed

    private void profileSearchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileSearchBTNActionPerformed
        try{
            Connection DBConnection = DatabaseConnection.connectDB();
            
            String searchID = searchTF.getText();
            String query = "SELECT name,gender,dept,mail,contactNum,address FROM student_info WHERE id = ?";
            PreparedStatement statement = DBConnection.prepareStatement(query);
            statement.setString(1, searchID);
            ResultSet result = statement.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
            
            if(result.next()==false){
                JOptionPane.showMessageDialog(null, "Record is not found");
                model.setValueAt("", 0, 0);
                model.setValueAt("", 0, 1);
                model.setValueAt("", 0, 2);
                model.setValueAt("", 0, 3);
                model.setValueAt("", 0, 4);
                model.setValueAt("", 0, 5);
                model.setValueAt("", 0, 6);
                searchTF.setText("");
            }else{
                model.setValueAt(searchID, 0, 0);
                model.setValueAt(result.getString("name"), 0, 1);
                model.setValueAt(result.getString("dept"), 0, 2);
                model.setValueAt(result.getString("mail"), 0, 3);
                model.setValueAt(result.getString("contactNum"), 0, 4);
                model.setValueAt(result.getString("address"), 0, 5);
                model.setValueAt(result.getString("gender"), 0, 6);
                searchTF.setText("");
            }
            
            DBConnection.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
        
    }//GEN-LAST:event_profileSearchBTNActionPerformed

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)studentTable.getModel();
        int selectedRow = studentTable.getSelectedRow();
        
        
        idTF.setText(model.getValueAt(selectedRow, 0)+"");
        nameTF.setText(model.getValueAt(selectedRow, 1)+"");
        emailTF.setText(model.getValueAt(selectedRow, 3)+"");
        phoneTF.setText(model.getValueAt(selectedRow, 4)+"");
        addressTF.setText(model.getValueAt(selectedRow, 5)+"");
        
        if(model.getValueAt(selectedRow, 2).equals("CSE")){
           deptBOX.setSelectedIndex(0);
        }else if(model.getValueAt(selectedRow, 2).equals("EEE")){
            deptBOX.setSelectedIndex(1);
        }else if(model.getValueAt(selectedRow, 2).equals("BBA")){
            deptBOX.setSelectedIndex(2);
        }else{
            deptBOX.setSelectedIndex(3);
        }
        
        if(model.getValueAt(selectedRow, 6).equals("Male")){
           genderBOX.setSelectedIndex(0);
        }else if(model.getValueAt(selectedRow, 6).equals("Female")){
             genderBOX.setSelectedIndex(1);
        }else{
             genderBOX.setSelectedIndex(2);
        }
    }//GEN-LAST:event_studentTableMouseClicked

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField completedCreditTF;
    private javax.swing.JTextField creditTF;
    private javax.swing.JTextField currentCGPATF;
    private javax.swing.JTabbedPane dashboardTabPanel;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JComboBox<String> deptBOX;
    private javax.swing.JTextArea display;
    private javax.swing.JTextField emailTF;
    private javax.swing.JComboBox<String> genderBOX;
    private javax.swing.JTextField gpaTF;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JButton profileSearchBTN;
    private javax.swing.JPanel profileTab;
    private javax.swing.JPanel queriesPanel;
    private javax.swing.JPanel queriesTab;
    private javax.swing.JTextField queryIDTF;
    private javax.swing.JButton querySearchBTN;
    private javax.swing.JButton resetBTN;
    private javax.swing.JTextField resultIdTF;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JButton resultResetBTN;
    private javax.swing.JButton resultSearchBTN;
    private javax.swing.JPanel resultTab;
    private javax.swing.JButton resultUpdateBTN;
    private javax.swing.JTextField searchTF;
    private javax.swing.JTable studentTable;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}
