/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metropark.university;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static metropark.university.login.sql;

/**
 *
 * @author laksh
 */
public class addupdateRsults extends javax.swing.JFrame {

    /**
     * Creates new form examinationResults
     */
    public addupdateRsults() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtStudentNo = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtmrk01 = new javax.swing.JTextField();
        txtmrk02 = new javax.swing.JTextField();
        txtmrk03 = new javax.swing.JTextField();
        txtmrk04 = new javax.swing.JTextField();
        txtmrk05 = new javax.swing.JTextField();
        txtmrk06 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Metropark University Student Details");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SEARCH STUDENT RESULTS :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel2.setText("Enter Student No : ");

        btnSearch.setForeground(new java.awt.Color(255, 0, 0));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStudentNo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(txtStudentNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnSearch))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "STUDENT DETAILS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 0))); // NOI18N

        jLabel1.setText("Student No : ");

        jLabel4.setText("First Name :");

        jLabel5.setText("Last Name :");

        jLabel6.setText("Course :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 450, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(109, 109, 109))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addGap(29, 29, 29))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESULTS :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 51, 0))); // NOI18N

        jLabel12.setText("Module");

        jLabel13.setText("Module");

        jLabel14.setText("Module");

        jLabel15.setText("Module");

        jLabel16.setText("Module");

        jLabel17.setText("Module");

        txtmrk06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmrk06ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12))
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtmrk01, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(txtmrk02)
                    .addComponent(txtmrk03))
                .addGap(112, 112, 112)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addGap(111, 111, 111)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmrk06)
                    .addComponent(txtmrk04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmrk05, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtmrk04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtmrk05, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtmrk06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(txtmrk01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtmrk02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtmrk03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 255, 255), null));

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metropark/images/addIcon.jpg"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metropark/images/updateIcon.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel11.setText("ADD RESULTS/ UPDATE RESULTS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(30, 30, 30)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(4, 4, 4)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String stdNo = txtStudentNo.getText();
        try (Connection conn = DriverManager.getConnection(sql.db_URL, sql.db_Username, sql.db_Password)) {
            String sqlStatement = "SELECT * FROM student WHERE studentNo = ?";
            PreparedStatement statement = conn.prepareStatement(sqlStatement);
            statement.setString(1, stdNo);
            ResultSet fetch = statement.executeQuery();

            if (fetch.next()) {
                String stc = fetch.getString("studentNo");
                String fname = fetch.getString("FirstName");
                String lname = fetch.getString("LastName");
                String course = fetch.getString("Course");
                System.out.println(course);

                jLabel7.setText(stc);
                jLabel8.setText(fname);
                jLabel9.setText(lname);
                jLabel10.setText(course);

            } else {

                JOptionPane.showMessageDialog(null, " Invalid Student Number ! ");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        if (jLabel10.getText().equalsIgnoreCase("BSc. Software Engineering")) {
            String stdNo1 = txtStudentNo.getText();
            try (Connection con = DriverManager.getConnection(sql.db_URL, sql.db_Username, sql.db_Password)) {
                String sqlStatement1 = "SELECT * FROM bscsoftwareengineering WHERE studentNo = ?";
                PreparedStatement statement1 = con.prepareStatement(sqlStatement1);
                statement1.setString(1, stdNo1);
                ResultSet fetch1 = statement1.executeQuery();
                ResultSetMetaData fetchColumn = statement1.getMetaData();
                String column = fetchColumn.getColumnName(2);
                String column2 = fetchColumn.getColumnName(3);
                String column3 = fetchColumn.getColumnName(4);
                String column4 = fetchColumn.getColumnName(5);
                String column5 = fetchColumn.getColumnName(6);
                String column6 = fetchColumn.getColumnName(7);
                jLabel12.setText(column);
                jLabel13.setText(column2);
                jLabel14.setText(column3);
                jLabel15.setText(column4);
                jLabel16.setText(column5);
                jLabel17.setText(column6);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (jLabel10.getText().equalsIgnoreCase("BSc. Information Systems")) {
            String stdNo1 = txtStudentNo.getText();
            try (Connection con = DriverManager.getConnection(sql.db_URL, sql.db_Username, sql.db_Password)) {
                String sqlStatement1 = "SELECT * FROM bscinformationsystems WHERE studentNo = ?";
                PreparedStatement statement1 = con.prepareStatement(sqlStatement1);
                statement1.setString(1, stdNo1);
                ResultSet fetch1 = statement1.executeQuery();
                ResultSetMetaData fetchColumn = statement1.getMetaData();
                String column = fetchColumn.getColumnName(2);
                String column2 = fetchColumn.getColumnName(3);
                String column3 = fetchColumn.getColumnName(4);
                String column4 = fetchColumn.getColumnName(5);
                String column5 = fetchColumn.getColumnName(6);
                String column6 = fetchColumn.getColumnName(7);
                jLabel12.setText(column);
                jLabel13.setText(column2);
                jLabel14.setText(column3);
                jLabel15.setText(column4);
                jLabel16.setText(column5);
                jLabel17.setText(column6);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (jLabel10.getText().equalsIgnoreCase("BSc. Software Engineering")) {
            try (Connection conn = DriverManager.getConnection(sql.db_URL, sql.db_Username, sql.db_Password)) {
                String sqlStatement = "SELECT * FROM bscsoftwareengineering WHERE studentNo = ?";
                PreparedStatement statement = conn.prepareStatement(sqlStatement);
                statement.setString(1, stdNo);
                ResultSet fetch = statement.executeQuery();
                if (fetch.next()) {
                    int i = fetch.getInt("sdp1");
                    int i2 = fetch.getInt("db");
                    int i3 = fetch.getInt("mathematics");
                    int i4 = fetch.getInt("oop1");
                    int i5 = fetch.getInt("wd");
                    int i6 = fetch.getInt("cf");
                    String con1 = Integer.toString(i);
                    String con2 = Integer.toString(i2);
                    String con3 = Integer.toString(i3);
                    String con4 = Integer.toString(i4);
                    String con5 = Integer.toString(i5);
                    String con6 = Integer.toString(i6);

                    txtmrk01.setText(con1);
                    txtmrk02.setText(con2);
                    txtmrk03.setText(con3);
                    txtmrk04.setText(con4);
                    txtmrk05.setText(con5);
                    txtmrk06.setText(con6);

                    //    System.out.println(fetch.getInt("studentNo") + " " + fetch.getString("studentFirstName") + " " + fetch.getString("studentLastName"));
                } //else {
                // JOptionPane.showMessageDialog(null, "Invalid Student Number !");
                //   }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, " Please enter numerics ! ");
            }
        } else if (jLabel10.getText().equalsIgnoreCase("BSc. Information Systems")) {
            try (Connection conn = DriverManager.getConnection(sql.db_URL, sql.db_Username, sql.db_Password)) {
                String sqlStatement = "SELECT * FROM bscinformationsystems WHERE studentNo = ?";
                PreparedStatement statement = conn.prepareStatement(sqlStatement);
                statement.setString(1, stdNo);
                ResultSet fetch = statement.executeQuery();
                if (fetch.next()) {
                    int i = fetch.getInt(2);
                    int i2 = fetch.getInt(3);
                    int i3 = fetch.getInt(4);
                    int i4 = fetch.getInt(5);
                    int i5 = fetch.getInt(6);
                    int i6 = fetch.getInt(7);
                    String con1 = Integer.toString(i);
                    String con2 = Integer.toString(i2);
                    String con3 = Integer.toString(i3);
                    String con4 = Integer.toString(i4);
                    String con5 = Integer.toString(i5);
                    String con6 = Integer.toString(i6);

                    txtmrk01.setText(con1);
                    txtmrk02.setText(con2);
                    txtmrk03.setText(con3);
                    txtmrk04.setText(con4);
                    txtmrk05.setText(con5);
                    txtmrk06.setText(con6);

                    //    System.out.println(fetch.getInt("studentNo") + " " + fetch.getString("studentFirstName") + " " + fetch.getString("studentLastName"));
                } //else {
                // JOptionPane.showMessageDialog(null, "Invalid Student Number !");
                //   }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, " Please enter numerics ! ");
            }
        }


    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (jLabel10.getText().equalsIgnoreCase("BSc. Software Engineering")) {
            String stduNo = txtStudentNo.getText();
            String module1 = txtmrk01.getText();
            String module2 = txtmrk02.getText();
            String module3 = txtmrk03.getText();
            String module4 = txtmrk04.getText();
            String module5 = txtmrk05.getText();
            String module6 = txtmrk06.getText();
            int i1 = Integer.parseInt(module1);
            int i2 = Integer.parseInt(module2);
            int i3 = Integer.parseInt(module3);
            int i4 = Integer.parseInt(module4);
            int i5 = Integer.parseInt(module5);
            int i6 = Integer.parseInt(module6);

            // if (jLabel10.getText().equalsIgnoreCase("bscsoftwareengineering")) {
            try (Connection conn = DriverManager.getConnection(sql.db_URL, sql.db_Username, sql.db_Password)) {
                String sqlStatement = "INSERT INTO bscsoftwareengineering(studentNo,sdp1,db,mathematics,oop1,wd,cf) VALUES (?,?,?,?,?,?,?)";
                PreparedStatement statement = conn.prepareStatement(sqlStatement);

                statement.setString(1, stduNo);
                statement.setInt(2, i1);
                statement.setInt(3, i2);
                statement.setInt(4, i3);
                statement.setInt(5, i4);
                statement.setInt(6, i5);
                statement.setInt(7, i6);
                JOptionPane.showMessageDialog(null, "Results Added Successfully");
                statement.executeUpdate();
                clearReuslts();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            //}
        } else if (jLabel10.getText().equalsIgnoreCase("BSc. Information Systems")) {
            String stduNo = txtStudentNo.getText();
            String module1 = txtmrk01.getText();
            String module2 = txtmrk02.getText();
            String module3 = txtmrk03.getText();
            String module4 = txtmrk04.getText();
            String module5 = txtmrk05.getText();
            String module6 = txtmrk06.getText();
            int i1 = Integer.parseInt(module1);
            int i2 = Integer.parseInt(module2);
            int i3 = Integer.parseInt(module3);
            int i4 = Integer.parseInt(module4);
            int i5 = Integer.parseInt(module5);
            int i6 = Integer.parseInt(module6);

            // if (jLabel10.getText().equalsIgnoreCase("bscsoftwareengineering")) {
            try (Connection conn = DriverManager.getConnection(sql.db_URL, sql.db_Username, sql.db_Password)) {
                String sqlStatement = "INSERT INTO bscinformationsystems(studentNo,accounting,computersecurity,communicationskills,mathematics,sdp01,webdesigning) VALUES (?,?,?,?,?,?,?)";
                PreparedStatement statement = conn.prepareStatement(sqlStatement);

                statement.setString(1, stduNo);
                statement.setInt(2, i1);
                statement.setInt(3, i2);
                statement.setInt(4, i3);
                statement.setInt(5, i4);
                statement.setInt(6, i5);
                statement.setInt(7, i6);
                JOptionPane.showMessageDialog(null, "Results Added Successfully");
                statement.executeUpdate();
                clearReuslts();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            //}
        } else {
            JOptionPane.showMessageDialog(null, " Invalid Module Selection ! ");
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (jLabel10.getText().equalsIgnoreCase("BSc. Software Engineering")) {
            String stuNo = txtStudentNo.getText();
            try (Connection conn = DriverManager.getConnection(sql.db_URL, sql.db_Username, sql.db_Password)) {
                String sqlStatement = "UPDATE bscsoftwareengineering SET sdp1=?,db=?,mathematics=?,oop1=?,wd=?,cf=? WHERE studentNo=" + stuNo;
                PreparedStatement statement = conn.prepareStatement(sqlStatement);
                //statement.setInt(1,StudentNo);
                String module1 = txtmrk01.getText();
                String module2 = txtmrk02.getText();
                String module3 = txtmrk03.getText();
                String module4 = txtmrk04.getText();
                String module5 = txtmrk05.getText();
                String module6 = txtmrk06.getText();
                int i1 = Integer.parseInt(module1);
                int i2 = Integer.parseInt(module2);
                int i3 = Integer.parseInt(module3);
                int i4 = Integer.parseInt(module4);
                int i5 = Integer.parseInt(module5);
                int i6 = Integer.parseInt(module6);

                statement.setInt(1, i1);
                statement.setInt(2, i2);
                statement.setInt(3, i3);
                statement.setInt(4, i4);
                statement.setInt(5, i5);
                statement.setInt(6, i6);

                int rowupdate = statement.executeUpdate();

                if (rowupdate > 0) {
                    JOptionPane.showMessageDialog(null, " Update Successful ! ");
                    clearReuslts();
                } else {
                    JOptionPane.showMessageDialog(null, " Update Unsuccessful ! ");
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        } else if (jLabel10.getText().equalsIgnoreCase("BSc. Information Systems")) {
            String stuNo = txtStudentNo.getText();
            try (Connection conn = DriverManager.getConnection(sql.db_URL, sql.db_Username, sql.db_Password)) {
                String sqlStatement = "UPDATE bscinformationsystems SET accounting=?,computersecurity=?,communicationskills=?,mathematics=?,sdp01=?,webdesigning=? WHERE studentNo=" + stuNo;
                PreparedStatement statement = conn.prepareStatement(sqlStatement);
                //statement.setInt(1,StudentNo);
                String module1 = txtmrk01.getText();
                String module2 = txtmrk02.getText();
                String module3 = txtmrk03.getText();
                String module4 = txtmrk04.getText();
                String module5 = txtmrk05.getText();
                String module6 = txtmrk06.getText();
                int i1 = Integer.parseInt(module1);
                int i2 = Integer.parseInt(module2);
                int i3 = Integer.parseInt(module3);
                int i4 = Integer.parseInt(module4);
                int i5 = Integer.parseInt(module5);
                int i6 = Integer.parseInt(module6);

                statement.setInt(1, i1);
                statement.setInt(2, i2);
                statement.setInt(3, i3);
                statement.setInt(4, i4);
                statement.setInt(5, i5);
                statement.setInt(6, i6);

                int rowupdate = statement.executeUpdate();

                if (rowupdate > 0) {
                    JOptionPane.showMessageDialog(null, " Update Successful ! ");
                    clearReuslts();
                } else {
                    JOptionPane.showMessageDialog(null, " Update Unsuccessful ! ");
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtmrk06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmrk06ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmrk06ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addupdateRsults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addupdateRsults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addupdateRsults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addupdateRsults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addupdateRsults().setVisible(true);
            }
        });
    }

    public void clearReuslts() {
        txtmrk01.setText("");
        txtmrk02.setText("");
        txtmrk03.setText("");
        txtmrk04.setText("");
        txtmrk05.setText("");
        txtmrk06.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtStudentNo;
    private javax.swing.JTextField txtmrk01;
    private javax.swing.JTextField txtmrk02;
    private javax.swing.JTextField txtmrk03;
    private javax.swing.JTextField txtmrk04;
    private javax.swing.JTextField txtmrk05;
    private javax.swing.JTextField txtmrk06;
    // End of variables declaration//GEN-END:variables
}
