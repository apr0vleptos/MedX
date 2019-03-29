package MedX;

    // <editor-fold defaultstate="collapsed" desc="Imports">
import java.awt.CardLayout;
import java.sql.Connection;
import javax.swing.JToggleButton;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
    // </editor-fold>

public class StoreKeeper extends javax.swing.JFrame {
    
    // <editor-fold defaultstate="collapsed" desc="StoreKeeper Constructor">
    public StoreKeeper(String user,Connection condb) {
        initComponents();
        conn=condb;
        this.setLocationRelativeTo(null);
        BackgroundImage.requestFocus();
        Button2.setVisible(false);
        Button3.setVisible(false);
        Button4.setVisible(false);  
        this.setTitle("MedX - Καλώς ήρθες αποθηκάριε - "+user);
        AutoCompleteDecorator.decorate(Rec_Name_List);
    }
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Panel0 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        Panel3 = new javax.swing.JPanel();
        Panel4 = new javax.swing.JPanel();
        Panel5 = new javax.swing.JPanel();
        Main_Messages = new javax.swing.JPanel();
        New_Message_Button = new javax.swing.JButton();
        Refresh_Button = new javax.swing.JButton();
        Message_Box = new javax.swing.JTabbedPane();
        Incoming_Panel = new javax.swing.JPanel();
        Incoming_Scroll = new javax.swing.JScrollPane();
        Incoming_List = new javax.swing.JList<>();
        Outgoing_Panel = new javax.swing.JPanel();
        Outgoing_Scroll = new javax.swing.JScrollPane();
        Outgoing_List = new javax.swing.JList<>();
        New_Message = new javax.swing.JPanel();
        Recepient = new javax.swing.JLabel();
        Rec_Type_List = new javax.swing.JComboBox<>();
        Rec_Name_List = new javax.swing.JComboBox<>();
        Message_Area_Scroll = new javax.swing.JScrollPane();
        Message_Text = new javax.swing.JTextArea();
        Send_Button = new javax.swing.JButton();
        Cancel_Button = new javax.swing.JButton();
        Message_Expanded = new javax.swing.JPanel();
        Return_Button_Message_Expanded = new javax.swing.JButton();
        Message_Expanded_Scroll = new javax.swing.JScrollPane();
        Message_Expanded_Text = new javax.swing.JTextArea();
        Message_Expanded_SR = new javax.swing.JTextField();
        Message_Expanded_DateTime = new javax.swing.JTextField();
        Message_Expanded_SR_Label = new javax.swing.JLabel();
        Message_Expanded_DateTime_Label = new javax.swing.JLabel();
        Message_Delete_Button = new javax.swing.JButton();
        Panel6 = new javax.swing.JPanel();
        StoreKeeper_Username = new javax.swing.JTextField();
        StoreKeeper_Password = new javax.swing.JTextField();
        StoreKeeper_Name = new javax.swing.JTextField();
        StoreKeeper_LastName = new javax.swing.JTextField();
        StoreKeeper_Telephone0 = new javax.swing.JTextField();
        StoreKeeper_Telephone1 = new javax.swing.JTextField();
        StoreKeeper_Adress = new javax.swing.JTextField();
        StoreKeeper_Start_Work = new javax.swing.JTextField();
        StoreKeeper_Email = new javax.swing.JTextField();
        StoreKeeper_Birthday = new javax.swing.JTextField();
        StoreKeeper_Update_Button = new javax.swing.JButton();
        Edit_Information_Label = new javax.swing.JLabel();
        StoreKeeper_Name_Label = new javax.swing.JLabel();
        StoreKeeper_LastName_Label = new javax.swing.JLabel();
        StoreKeeper_Birthday_Label = new javax.swing.JLabel();
        StoreKeeper_Telephone_Label = new javax.swing.JLabel();
        StoreKeeper_Adress_Label = new javax.swing.JLabel();
        StoreKeeper_Start_Work_Label = new javax.swing.JLabel();
        StoreKeeper_Email_Label = new javax.swing.JLabel();
        StoreKeeper_Username_Label = new javax.swing.JLabel();
        StoreKeeper_Password_Label = new javax.swing.JLabel();
        Button0 = new javax.swing.JToggleButton();
        Button1 = new javax.swing.JToggleButton();
        Button2 = new javax.swing.JToggleButton();
        Button3 = new javax.swing.JToggleButton();
        Button4 = new javax.swing.JToggleButton();
        Button5 = new javax.swing.JToggleButton();
        Button6 = new javax.swing.JToggleButton();
        Logout_Button = new javax.swing.JButton();
        SeparatorHorTop = new javax.swing.JSeparator();
        SeperatorHorBot = new javax.swing.JSeparator();
        SeperatorVerLef = new javax.swing.JSeparator();
        SeperatorVerRig = new javax.swing.JSeparator();
        BackgroundMedX = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/windowicon.png")).getImage());
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        MainPanel.setVisible(false);
        MainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MainPanel.setPreferredSize(new java.awt.Dimension(410, 340));
        MainPanel.setLayout(new java.awt.CardLayout());

        Panel0.setLayout(null);
        MainPanel.add(Panel0, "Panel0");

        Panel1.setLayout(null);
        MainPanel.add(Panel1, "Panel1");

        Panel2.setLayout(null);
        MainPanel.add(Panel2, "Panel2");

        Panel3.setLayout(null);
        MainPanel.add(Panel3, "Panel3");

        Panel4.setLayout(null);
        MainPanel.add(Panel4, "Panel4");

        Panel5.setLayout(new java.awt.CardLayout());

        Main_Messages.setLayout(null);

        New_Message_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Message_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/New_Message_Icon.png"))); // NOI18N
        New_Message_Button.setText("ΝΕΟ ΜΗΝΥΜΑ");
        New_Message_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        New_Message_Button.setFocusPainted(false);
        New_Message_Button.setFocusable(false);
        New_Message_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_Message_ButtonActionPerformed(evt);
            }
        });
        Main_Messages.add(New_Message_Button);
        New_Message_Button.setBounds(325, 0, 140, 28);

        Refresh_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/refresh-icon.png"))); // NOI18N
        Refresh_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Refresh_Button.setFocusPainted(false);
        Refresh_Button.setFocusable(false);
        Main_Messages.add(Refresh_Button);
        Refresh_Button.setBounds(465, 0, 50, 28);

        Message_Box.setToolTipText("");
        Message_Box.setFocusable(false);
        Message_Box.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        Incoming_Panel.setLayout(null);

        Incoming_Scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Incoming_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Incoming_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Εισερχόμενα 1", "Εισερχόμενα 2", "Εισερχόμενα 3", "Εισερχόμενα 4", "Εισερχόμενα 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Incoming_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Incoming_List.setToolTipText("");
        Incoming_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Incoming_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Incoming_ListMouseReleased(evt);
            }
        });
        Incoming_Scroll.setViewportView(Incoming_List);

        Incoming_Panel.add(Incoming_Scroll);
        Incoming_Scroll.setBounds(10, 10, 490, 380);

        Message_Box.addTab("ΕΙΣΕΡΧΟΜΕΝΑ ", new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Incoming_Mail_Icon.png")), Incoming_Panel); // NOI18N

        Outgoing_Panel.setLayout(null);

        Outgoing_Scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Outgoing_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Outgoing_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Απεσταλμένα 1", "Απεσταλμένα 2", "Απεσταλμένα 3", "Απεσταλμένα 4", "Απεσταλμένα 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Outgoing_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Outgoing_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Outgoing_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Outgoing_ListMouseReleased(evt);
            }
        });
        Outgoing_Scroll.setViewportView(Outgoing_List);

        Outgoing_Panel.add(Outgoing_Scroll);
        Outgoing_Scroll.setBounds(10, 10, 490, 380);

        Message_Box.addTab("ΑΠΕΣΤΑΛΜΕΝΑ ", new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Outgoing_Mail_Icon.png")), Outgoing_Panel); // NOI18N

        Main_Messages.add(Message_Box);
        Message_Box.setBounds(0, 0, 530, 440);

        Panel5.add(Main_Messages, "Main_Messages");

        New_Message.setMinimumSize(new java.awt.Dimension(400, 350));
        New_Message.setPreferredSize(new java.awt.Dimension(400, 350));
        New_Message.setLayout(null);

        Recepient.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Recepient.setText("ΠΑΡΑΛΗΠΤΗΣ:");
        Recepient.setFocusable(false);
        New_Message.add(Recepient);
        Recepient.setBounds(20, 10, 100, 40);

        Rec_Type_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Rec_Type_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Γιατρός", "Νοσοκόμος", "Γραμματέας", "Διευθυντής" }));
        Rec_Type_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rec_Type_List.setFocusable(false);
        New_Message.add(Rec_Type_List);
        Rec_Type_List.setBounds(120, 10, 100, 40);

        Rec_Name_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Rec_Name_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        New_Message.add(Rec_Name_List);
        Rec_Name_List.setBounds(230, 10, 270, 40);

        Message_Text.setColumns(20);
        Message_Text.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Message_Text.setLineWrap(true);
        Message_Text.setRows(5);
        Message_Text.setWrapStyleWord(true);
        Message_Area_Scroll.setViewportView(Message_Text);

        New_Message.add(Message_Area_Scroll);
        Message_Area_Scroll.setBounds(20, 60, 480, 310);

        Send_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Send_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Enter_Icon.png"))); // NOI18N
        Send_Button.setText("ΑΠΟΣΤΟΛΗ");
        Send_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Send_Button.setFocusable(false);
        Send_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        New_Message.add(Send_Button);
        Send_Button.setBounds(110, 390, 130, 30);

        Cancel_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Cancel_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Cancel_Icon.png"))); // NOI18N
        Cancel_Button.setText("ΑΚΥΡΩΣΗ");
        Cancel_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel_Button.setFocusable(false);
        Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_ButtonActionPerformed(evt);
            }
        });
        New_Message.add(Cancel_Button);
        Cancel_Button.setBounds(260, 390, 130, 30);

        Panel5.add(New_Message, "New_Message");

        Message_Expanded.setLayout(null);

        Return_Button_Message_Expanded.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Return_Button_Message_Expanded.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Back_Arrow.png"))); // NOI18N
        Return_Button_Message_Expanded.setText("ΕΠΙΣΤΡΟΦΗ");
        Return_Button_Message_Expanded.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Return_Button_Message_Expanded.setFocusPainted(false);
        Return_Button_Message_Expanded.setFocusable(false);
        Return_Button_Message_Expanded.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_Button_Message_ExpandedActionPerformed(evt);
            }
        });
        Message_Expanded.add(Return_Button_Message_Expanded);
        Return_Button_Message_Expanded.setBounds(360, 390, 130, 30);

        Message_Expanded_Text.setEditable(false);
        Message_Expanded_Text.setColumns(20);
        Message_Expanded_Text.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Message_Expanded_Text.setLineWrap(true);
        Message_Expanded_Text.setRows(5);
        Message_Expanded_Text.setWrapStyleWord(true);
        Message_Expanded_Text.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Message_Expanded_Scroll.setViewportView(Message_Expanded_Text);

        Message_Expanded.add(Message_Expanded_Scroll);
        Message_Expanded_Scroll.setBounds(18, 90, 480, 280);

        Message_Expanded_SR.setEditable(false);
        Message_Expanded_SR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Message_Expanded_SR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Message_Expanded.add(Message_Expanded_SR);
        Message_Expanded_SR.setBounds(20, 30, 210, 40);

        Message_Expanded_DateTime.setEditable(false);
        Message_Expanded_DateTime.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Message_Expanded_DateTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Message_Expanded.add(Message_Expanded_DateTime);
        Message_Expanded_DateTime.setBounds(288, 30, 210, 40);

        Message_Expanded_SR_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Message_Expanded_SR_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Message_Expanded_SR_Label.setText("ΑΠΟΣΤΟΛΕΑΣ/ΠΑΡΑΛΗΠΤΗΣ");
        Message_Expanded.add(Message_Expanded_SR_Label);
        Message_Expanded_SR_Label.setBounds(20, 0, 210, 30);

        Message_Expanded_DateTime_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Message_Expanded_DateTime_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Message_Expanded_DateTime_Label.setText("ΗΜΕΡΟΜΗΝΙΑ / ΩΡΑ");
        Message_Expanded.add(Message_Expanded_DateTime_Label);
        Message_Expanded_DateTime_Label.setBounds(288, 0, 210, 30);

        Message_Delete_Button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Message_Delete_Button.setForeground(new java.awt.Color(255, 51, 51));
        Message_Delete_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Delete_Icon.png"))); // NOI18N
        Message_Delete_Button.setText("ΔΙΑΓΡΑΦΗ ΜΗΝΥΜΑΤΟΣ");
        Message_Delete_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Message_Delete_Button.setFocusable(false);
        Message_Delete_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Message_Expanded.add(Message_Delete_Button);
        Message_Delete_Button.setBounds(20, 390, 200, 30);

        Panel5.add(Message_Expanded, "Message_Expanded");

        MainPanel.add(Panel5, "Panel5");

        Panel6.setLayout(null);

        StoreKeeper_Username.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(StoreKeeper_Username);
        StoreKeeper_Username.setBounds(20, 80, 150, 40);

        StoreKeeper_Password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(StoreKeeper_Password);
        StoreKeeper_Password.setBounds(185, 80, 150, 40);

        StoreKeeper_Name.setEditable(false);
        StoreKeeper_Name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(StoreKeeper_Name);
        StoreKeeper_Name.setBounds(20, 180, 150, 40);

        StoreKeeper_LastName.setEditable(false);
        StoreKeeper_LastName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_LastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(StoreKeeper_LastName);
        StoreKeeper_LastName.setBounds(185, 180, 150, 40);

        StoreKeeper_Telephone0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Telephone0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(StoreKeeper_Telephone0);
        StoreKeeper_Telephone0.setBounds(20, 280, 150, 20);

        StoreKeeper_Telephone1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Telephone1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(StoreKeeper_Telephone1);
        StoreKeeper_Telephone1.setBounds(20, 300, 150, 20);

        StoreKeeper_Adress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Adress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(StoreKeeper_Adress);
        StoreKeeper_Adress.setBounds(185, 280, 150, 40);

        StoreKeeper_Start_Work.setEditable(false);
        StoreKeeper_Start_Work.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Start_Work.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(StoreKeeper_Start_Work);
        StoreKeeper_Start_Work.setBounds(350, 280, 150, 40);

        StoreKeeper_Email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(StoreKeeper_Email);
        StoreKeeper_Email.setBounds(350, 80, 150, 40);

        StoreKeeper_Birthday.setEditable(false);
        StoreKeeper_Birthday.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Birthday.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(StoreKeeper_Birthday);
        StoreKeeper_Birthday.setBounds(350, 180, 150, 40);

        StoreKeeper_Update_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        StoreKeeper_Update_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Enter_Icon.png"))); // NOI18N
        StoreKeeper_Update_Button.setText("ΕΝΗΜΕΡΩΣΗ");
        StoreKeeper_Update_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StoreKeeper_Update_Button.setFocusable(false);
        StoreKeeper_Update_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Panel6.add(StoreKeeper_Update_Button);
        StoreKeeper_Update_Button.setBounds(185, 360, 150, 40);

        Edit_Information_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Edit_Information_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edit_Information_Label.setText("ΕΠΕΞΕΡΓΑΣΙΑ ΣΤΟΙΧΕΙΩΝ ΛΟΓΑΡΙΑΣΜΟΥ");
        Panel6.add(Edit_Information_Label);
        Edit_Information_Label.setBounds(60, 10, 390, 30);

        StoreKeeper_Name_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StoreKeeper_Name_Label.setText("ΟΝΟΜΑ");
        Panel6.add(StoreKeeper_Name_Label);
        StoreKeeper_Name_Label.setBounds(20, 160, 150, 20);

        StoreKeeper_LastName_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_LastName_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StoreKeeper_LastName_Label.setText("ΕΠΩΝΥΜΟ");
        Panel6.add(StoreKeeper_LastName_Label);
        StoreKeeper_LastName_Label.setBounds(185, 160, 150, 20);

        StoreKeeper_Birthday_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Birthday_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StoreKeeper_Birthday_Label.setText("ΗΜ/ΝΙΑ ΓΕΝΝΗΣΗΣ");
        Panel6.add(StoreKeeper_Birthday_Label);
        StoreKeeper_Birthday_Label.setBounds(350, 160, 150, 20);

        StoreKeeper_Telephone_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Telephone_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StoreKeeper_Telephone_Label.setText("ΤΗΛΕΦΩΝΑ");
        Panel6.add(StoreKeeper_Telephone_Label);
        StoreKeeper_Telephone_Label.setBounds(20, 260, 150, 20);

        StoreKeeper_Adress_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Adress_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StoreKeeper_Adress_Label.setText("ΔΙΕΥΘΥΝΣΗ");
        Panel6.add(StoreKeeper_Adress_Label);
        StoreKeeper_Adress_Label.setBounds(185, 260, 150, 20);

        StoreKeeper_Start_Work_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Start_Work_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StoreKeeper_Start_Work_Label.setText("ΕΝΑΡΞΗ ΕΡΓΑΣΙΑΣ");
        Panel6.add(StoreKeeper_Start_Work_Label);
        StoreKeeper_Start_Work_Label.setBounds(350, 260, 150, 20);

        StoreKeeper_Email_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Email_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StoreKeeper_Email_Label.setText("E-Mail");
        Panel6.add(StoreKeeper_Email_Label);
        StoreKeeper_Email_Label.setBounds(350, 60, 150, 20);

        StoreKeeper_Username_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Username_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StoreKeeper_Username_Label.setText("ΟΝΟΜΑ ΧΡΗΣΤΗ");
        Panel6.add(StoreKeeper_Username_Label);
        StoreKeeper_Username_Label.setBounds(20, 60, 150, 20);

        StoreKeeper_Password_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        StoreKeeper_Password_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StoreKeeper_Password_Label.setText("ΚΩΔΙΚΟΣ ΧΡΗΣΤΗ");
        Panel6.add(StoreKeeper_Password_Label);
        StoreKeeper_Password_Label.setBounds(185, 60, 150, 20);

        MainPanel.add(Panel6, "Panel6");

        getContentPane().add(MainPanel);
        MainPanel.setBounds(258, 15, 520, 440);

        Button0.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Button0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Box_Icon.png"))); // NOI18N
        Button0.setText("Αποθήκη");
        Button0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button0.setFocusPainted(false);
        Button0.setFocusable(false);
        Button0.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });
        getContentPane().add(Button0);
        Button0.setBounds(28, 30, 200, 50);

        Button1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Order_Icon.png"))); // NOI18N
        Button1.setText("Παραγγελία");
        Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button1.setFocusPainted(false);
        Button1.setFocusable(false);
        Button1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        getContentPane().add(Button1);
        Button1.setBounds(28, 90, 200, 50);

        Button2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Button2.setText("Button 2");
        Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button2.setFocusPainted(false);
        Button2.setFocusable(false);
        Button2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        getContentPane().add(Button2);
        Button2.setBounds(28, 150, 200, 50);

        Button3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Button3.setText("Button 3");
        Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button3.setFocusPainted(false);
        Button3.setFocusable(false);
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        getContentPane().add(Button3);
        Button3.setBounds(28, 210, 200, 50);

        Button4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Button4.setText("Button 4");
        Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button4.setFocusPainted(false);
        Button4.setFocusable(false);
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        getContentPane().add(Button4);
        Button4.setBounds(28, 270, 200, 50);

        Button5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Message_Icon.png"))); // NOI18N
        Button5.setText("Μηνύματα");
        Button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button5.setFocusPainted(false);
        Button5.setFocusable(false);
        Button5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        getContentPane().add(Button5);
        Button5.setBounds(28, 330, 200, 50);

        Button6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Button6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Card_Icon.png"))); // NOI18N
        Button6.setText("Ο Λογαριασμός μου");
        Button6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button6.setFocusPainted(false);
        Button6.setFocusable(false);
        Button6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        getContentPane().add(Button6);
        Button6.setBounds(28, 390, 200, 50);

        Logout_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Logout_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Logout_Icon.png"))); // NOI18N
        Logout_Button.setText("ΑΠΟΣΥΝΔΕΣΗ");
        Logout_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout_Button.setFocusPainted(false);
        Logout_Button.setFocusable(false);
        Logout_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Logout_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Logout_Button);
        Logout_Button.setBounds(610, 400, 150, 40);
        getContentPane().add(SeparatorHorTop);
        SeparatorHorTop.setBounds(18, 16, 220, 10);
        getContentPane().add(SeperatorHorBot);
        SeperatorHorBot.setBounds(18, 453, 220, 10);

        SeperatorVerLef.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(SeperatorVerLef);
        SeperatorVerLef.setBounds(17, 16, 10, 438);

        SeperatorVerRig.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(SeperatorVerRig);
        SeperatorVerRig.setBounds(238, 16, 10, 438);

        BackgroundMedX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/title.png"))); // NOI18N
        getContentPane().add(BackgroundMedX);
        BackgroundMedX.setBounds(598, 300, 180, 90);

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/background.jpg"))); // NOI18N
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 800, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Variables declaration">
    static Connection conn=null;
    String Medicine_Selected;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JLabel BackgroundMedX;
    private javax.swing.JToggleButton Button0;
    private javax.swing.JToggleButton Button1;
    private javax.swing.JToggleButton Button2;
    private javax.swing.JToggleButton Button3;
    private javax.swing.JToggleButton Button4;
    private javax.swing.JToggleButton Button5;
    private javax.swing.JToggleButton Button6;
    private javax.swing.JButton Cancel_Button;
    private javax.swing.JLabel Edit_Information_Label;
    private javax.swing.JList<String> Incoming_List;
    private javax.swing.JPanel Incoming_Panel;
    private javax.swing.JScrollPane Incoming_Scroll;
    private javax.swing.JButton Logout_Button;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Main_Messages;
    private javax.swing.JScrollPane Message_Area_Scroll;
    private javax.swing.JTabbedPane Message_Box;
    private javax.swing.JButton Message_Delete_Button;
    private javax.swing.JPanel Message_Expanded;
    private javax.swing.JTextField Message_Expanded_DateTime;
    private javax.swing.JLabel Message_Expanded_DateTime_Label;
    private javax.swing.JTextField Message_Expanded_SR;
    private javax.swing.JLabel Message_Expanded_SR_Label;
    private javax.swing.JScrollPane Message_Expanded_Scroll;
    private javax.swing.JTextArea Message_Expanded_Text;
    private javax.swing.JTextArea Message_Text;
    private javax.swing.JPanel New_Message;
    private javax.swing.JButton New_Message_Button;
    private javax.swing.JList<String> Outgoing_List;
    private javax.swing.JPanel Outgoing_Panel;
    private javax.swing.JScrollPane Outgoing_Scroll;
    private javax.swing.JPanel Panel0;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JComboBox<String> Rec_Name_List;
    private javax.swing.JComboBox<String> Rec_Type_List;
    private javax.swing.JLabel Recepient;
    private javax.swing.JButton Refresh_Button;
    private javax.swing.JButton Return_Button_Message_Expanded;
    private javax.swing.JButton Send_Button;
    private javax.swing.JSeparator SeparatorHorTop;
    private javax.swing.JSeparator SeperatorHorBot;
    private javax.swing.JSeparator SeperatorVerLef;
    private javax.swing.JSeparator SeperatorVerRig;
    private javax.swing.JTextField StoreKeeper_Adress;
    private javax.swing.JLabel StoreKeeper_Adress_Label;
    private javax.swing.JTextField StoreKeeper_Birthday;
    private javax.swing.JLabel StoreKeeper_Birthday_Label;
    private javax.swing.JTextField StoreKeeper_Email;
    private javax.swing.JLabel StoreKeeper_Email_Label;
    private javax.swing.JTextField StoreKeeper_LastName;
    private javax.swing.JLabel StoreKeeper_LastName_Label;
    private javax.swing.JTextField StoreKeeper_Name;
    private javax.swing.JLabel StoreKeeper_Name_Label;
    private javax.swing.JTextField StoreKeeper_Password;
    private javax.swing.JLabel StoreKeeper_Password_Label;
    private javax.swing.JTextField StoreKeeper_Start_Work;
    private javax.swing.JLabel StoreKeeper_Start_Work_Label;
    private javax.swing.JTextField StoreKeeper_Telephone0;
    private javax.swing.JTextField StoreKeeper_Telephone1;
    private javax.swing.JLabel StoreKeeper_Telephone_Label;
    private javax.swing.JButton StoreKeeper_Update_Button;
    private javax.swing.JTextField StoreKeeper_Username;
    private javax.swing.JLabel StoreKeeper_Username_Label;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Home Page">
    public void Check_Button(JToggleButton button_clicked){
        CardLayout card = (CardLayout)MainPanel.getLayout();
        JToggleButton[] Button = new JToggleButton[7];
        Button[0]=Button0;
        Button[1]=Button1;
        Button[2]=Button2;
        Button[3]=Button3;
        Button[4]=Button4;
        Button[5]=Button5;
        Button[6]=Button6;
        String[] Panel = new String[7];
        Panel[0]="Panel0";
        Panel[1]="Panel1";
        Panel[2]="Panel2";
        Panel[3]="Panel3";
        Panel[4]="Panel4";
        Panel[5]="Panel5";
        Panel[6]="Panel6";
        if(button_clicked.isSelected()){
            MainPanel.setVisible(true);
            Logout_Button.setVisible(false);
            for(int i=0;i<=6;i++){
                if(button_clicked!=Button[i]){
                    Button[i].setEnabled(false);
                }
                else{
                    card.show(MainPanel, Panel[i]);
                }
            }
        }
        else{
            MainPanel.setVisible(false);
            Logout_Button.setVisible(true);
            for(int i=0;i<=6;i++){
                Button[i].setEnabled(true);
            }
        }
    }
    
    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        Check_Button(Button0);
    }//GEN-LAST:event_Button0ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        Check_Button(Button1);
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        Check_Button(Button2);
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        Check_Button(Button3);
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        Check_Button(Button4);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        Check_Button(Button5);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        Check_Button(Button6);
    }//GEN-LAST:event_Button6ActionPerformed

    private void Logout_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_ButtonActionPerformed
        LoginScreen l = new LoginScreen(conn);
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Logout_ButtonActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel0">
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel1">
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel2">
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel3">
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel5">
    private void Return_Button_Message_ExpandedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_Button_Message_ExpandedActionPerformed
        CardLayout card = (CardLayout)Panel5.getLayout();
        card.show(Panel5, "Main_Messages");
    }//GEN-LAST:event_Return_Button_Message_ExpandedActionPerformed

    private void Incoming_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Incoming_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2) {
            CardLayout card = (CardLayout)Panel5.getLayout();
            card.show(Panel5, "Message_Expanded");
            Message_Expanded_SR_Label.setText("ΑΠΟΣΤΟΛΕΑΣ");
            Message_Expanded_Text.setText(Incoming_List.getSelectedValue());
        }
    }//GEN-LAST:event_Incoming_ListMouseReleased

    private void Outgoing_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Outgoing_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2) {
            CardLayout card = (CardLayout)Panel5.getLayout();
            card.show(Panel5, "Message_Expanded");
            Message_Expanded_SR_Label.setText("ΠΑΡΑΛΗΠΤΗΣ");
            Message_Expanded_Text.setText(Outgoing_List.getSelectedValue());
        }
    }//GEN-LAST:event_Outgoing_ListMouseReleased

    private void Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_ButtonActionPerformed
        CardLayout card = (CardLayout)Panel5.getLayout();
        card.show(Panel5, "Main_Messages");
    }//GEN-LAST:event_Cancel_ButtonActionPerformed

    private void New_Message_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_Message_ButtonActionPerformed
        CardLayout card = (CardLayout)Panel5.getLayout();
        card.show(Panel5, "New_Message");
    }//GEN-LAST:event_New_Message_ButtonActionPerformed

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel6">
    
    // </editor-fold>
    
}
