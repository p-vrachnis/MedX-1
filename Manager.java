package MedX;

    // <editor-fold defaultstate="collapsed" desc="Imports">
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JToggleButton;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
    // </editor-fold>

public class Manager extends javax.swing.JFrame {
    
    // <editor-fold defaultstate="collapsed" desc="Manager Constructor">
    public Manager(String name,Connection conndb) {
        initComponents();
        conn=conndb;
        user=name;
        this.setLocationRelativeTo(null);
        BackgroundImage.requestFocus();
        Button4.setVisible(false);
        this.setTitle("MedX - Καλώς ήρθες διευθυντή - "+user);
        Load_Worker_Type_List();
    }
    // </editor-fold>
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Panel0 = new javax.swing.JPanel();
        Main_Schedule_Panel = new javax.swing.JPanel();
        Schedule_List_Scroll = new javax.swing.JScrollPane();
        Schedule_List = new javax.swing.JList<>();
        Schedule_Label = new javax.swing.JLabel();
        Schedule_Expanded_Panel = new javax.swing.JPanel();
        Return_Button_Schedule = new javax.swing.JButton();
        Schedule_Expanded_Scroll = new javax.swing.JScrollPane();
        Schedule_Expanded_List = new javax.swing.JList<>();
        Panel1 = new javax.swing.JPanel();
        Workers_Schedule_Panel = new javax.swing.JPanel();
        Worker_Label = new javax.swing.JLabel();
        Worker_Type_List = new javax.swing.JComboBox<>();
        Worker_Name_Box = new javax.swing.JComboBox<>();
        Worker_Year = new javax.swing.JComboBox<>();
        Worker_Month = new javax.swing.JComboBox<>();
        Worker_Day = new javax.swing.JComboBox<>();
        Worker_Date_Label = new javax.swing.JLabel();
        Worker_Schedule_Scroll = new javax.swing.JScrollPane();
        Worker_Schedule_List = new javax.swing.JList<>();
        Panel2 = new javax.swing.JPanel();
        Main_Salary_Panel = new javax.swing.JPanel();
        Choose_Doctor_Label = new javax.swing.JLabel();
        Worker_Type_Box = new javax.swing.JComboBox<>();
        Workers_Name_Scroll = new javax.swing.JScrollPane();
        Workers_Name_List = new javax.swing.JList<>();
        Salary_Confirm_Button = new javax.swing.JButton();
        Doctor_Salary_Label = new javax.swing.JLabel();
        Doctor_Salary = new javax.swing.JTextField();
        Salary_Euro_Label0 = new javax.swing.JLabel();
        Chosen_Doctor_Name = new javax.swing.JTextField();
        Chosen_Doctor_Name_Label = new javax.swing.JLabel();
        Chosen_Doctor_LastName = new javax.swing.JTextField();
        Chosen_Doctor_LastName_Label = new javax.swing.JLabel();
        New_Worker_Button = new javax.swing.JButton();
        Insert_Success_Label = new javax.swing.JLabel();
        Insert_Failure_Label = new javax.swing.JLabel();
        New_Worker_Panel = new javax.swing.JPanel();
        Cancel_New_Worker_Button = new javax.swing.JButton();
        Insert_New_Worker_Button = new javax.swing.JButton();
        Insert_Worker_Data_Label = new javax.swing.JLabel();
        Worker_Username = new javax.swing.JTextField();
        Worker_Password = new javax.swing.JTextField();
        Worker_Email = new javax.swing.JTextField();
        Worker_Name = new javax.swing.JTextField();
        Worker_Lastname = new javax.swing.JTextField();
        Worker_Birth_Year = new javax.swing.JComboBox<>();
        Worker_Birth_Month = new javax.swing.JComboBox<>();
        Worker_Birth_Day = new javax.swing.JComboBox<>();
        Worker_Telephone0 = new javax.swing.JTextField();
        Worker_Telephone1 = new javax.swing.JTextField();
        Worker_Adress = new javax.swing.JTextField();
        Worker_Salary = new javax.swing.JTextField();
        Worker_Username_Label = new javax.swing.JLabel();
        Worker_Password_Label = new javax.swing.JLabel();
        Worker_Email_Label = new javax.swing.JLabel();
        Worker_Name_Label = new javax.swing.JLabel();
        Worker_LastName_Label = new javax.swing.JLabel();
        Worker_Birthday_Label = new javax.swing.JLabel();
        Worker_Telephone_Label = new javax.swing.JLabel();
        Worker_Adress_Label = new javax.swing.JLabel();
        Worker_Salary_Label = new javax.swing.JLabel();
        Insert_Error_Label = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        SeparatorHorTop1 = new javax.swing.JSeparator();
        SeparatorHorBot1 = new javax.swing.JSeparator();
        SeperatorVerLef1 = new javax.swing.JSeparator();
        SeperatorVerRig1 = new javax.swing.JSeparator();
        SeparatorHorTop2 = new javax.swing.JSeparator();
        SeparatorHorBot2 = new javax.swing.JSeparator();
        SeperatorVerLef2 = new javax.swing.JSeparator();
        SeperatorVerRig2 = new javax.swing.JSeparator();
        Income_Label = new javax.swing.JLabel();
        Patients_Income_Label = new javax.swing.JLabel();
        Medicines_Income_Label = new javax.swing.JLabel();
        Income_Total_Label = new javax.swing.JLabel();
        Patients_Income = new javax.swing.JTextField();
        Medicines_Income = new javax.swing.JTextField();
        Income_Total = new javax.swing.JTextField();
        Outcome_Label = new javax.swing.JLabel();
        Workers_Salary_Label = new javax.swing.JLabel();
        Medicine_Costs_Label = new javax.swing.JLabel();
        Hospital_Costs_Label = new javax.swing.JLabel();
        Outcome_Total_Label = new javax.swing.JLabel();
        Workers_Salary = new javax.swing.JTextField();
        Medicine_Costs = new javax.swing.JTextField();
        Hospital_Costs = new javax.swing.JTextField();
        Outcome_Total = new javax.swing.JTextField();
        Date_Label = new javax.swing.JLabel();
        Chosen_Year_Box = new javax.swing.JComboBox<>();
        Chosen_Month_Box = new javax.swing.JComboBox<>();
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
        Rec_Type_Box = new javax.swing.JComboBox<>();
        Rec_Name_Box = new javax.swing.JComboBox<>();
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
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        Birth_Date = new javax.swing.JTextField();
        Tel_0 = new javax.swing.JTextField();
        Tel_1 = new javax.swing.JTextField();
        Adress = new javax.swing.JTextField();
        Start_Date = new javax.swing.JTextField();
        Account_Update_Button = new javax.swing.JButton();
        Edit_Information_Label = new javax.swing.JLabel();
        Username_Label = new javax.swing.JLabel();
        Password_Label = new javax.swing.JLabel();
        Email_Label = new javax.swing.JLabel();
        Name_Label = new javax.swing.JLabel();
        LastName_Label = new javax.swing.JLabel();
        Birth_Date_Label = new javax.swing.JLabel();
        Tel_Label = new javax.swing.JLabel();
        Adress_Label = new javax.swing.JLabel();
        Start_Date_Label = new javax.swing.JLabel();
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
        getContentPane().setLayout(null);

        MainPanel.setVisible(false);
        MainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MainPanel.setPreferredSize(new java.awt.Dimension(410, 340));
        MainPanel.setLayout(new java.awt.CardLayout());

        Panel0.setLayout(new java.awt.CardLayout());

        Main_Schedule_Panel.setLayout(null);

        Schedule_List.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Schedule_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Schedule_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Schedule_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Schedule_ListMouseReleased(evt);
            }
        });
        Schedule_List_Scroll.setViewportView(Schedule_List);

        Main_Schedule_Panel.add(Schedule_List_Scroll);
        Schedule_List_Scroll.setBounds(20, 60, 480, 360);

        Schedule_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Schedule_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Schedule_Label.setText("ΠΡΟΓΡΑΜΜΑ ΗΜΕΡΑΣ : YYYY/MM/DD");
        Main_Schedule_Panel.add(Schedule_Label);
        Schedule_Label.setBounds(20, 20, 480, 22);

        Panel0.add(Main_Schedule_Panel, "Main_Schedule_Panel");

        Schedule_Expanded_Panel.setLayout(null);

        Return_Button_Schedule.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Return_Button_Schedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Back_Arrow.png"))); // NOI18N
        Return_Button_Schedule.setText("ΕΠΙΣΤΡΟΦΗ");
        Return_Button_Schedule.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Return_Button_Schedule.setFocusPainted(false);
        Return_Button_Schedule.setFocusable(false);
        Return_Button_Schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_Button_ScheduleActionPerformed(evt);
            }
        });
        Schedule_Expanded_Panel.add(Return_Button_Schedule);
        Return_Button_Schedule.setBounds(369, 389, 130, 30);

        Schedule_Expanded_List.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Schedule_Expanded_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Schedule_Expanded_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Schedule_Expanded_ListMouseReleased(evt);
            }
        });
        Schedule_Expanded_Scroll.setViewportView(Schedule_Expanded_List);

        Schedule_Expanded_Panel.add(Schedule_Expanded_Scroll);
        Schedule_Expanded_Scroll.setBounds(20, 20, 480, 400);

        Panel0.add(Schedule_Expanded_Panel, "Schedule_Expanded_Panel");

        MainPanel.add(Panel0, "Panel0");

        Panel1.setLayout(new java.awt.CardLayout());

        Workers_Schedule_Panel.setLayout(null);

        Worker_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Label.setText("ΕΡΓΑΖΟΜΕΝΟΣ :");
        Worker_Label.setFocusable(false);
        Workers_Schedule_Panel.add(Worker_Label);
        Worker_Label.setBounds(20, 20, 100, 20);

        Worker_Type_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Worker_Type_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Γιατρός", "Νοσοκόμος", "Γραμματέας", "Διευθυντής" }));
        Worker_Type_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Worker_Type_List.setFocusable(false);
        Worker_Type_List.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Worker_Type_ListPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Workers_Schedule_Panel.add(Worker_Type_List);
        Worker_Type_List.setBounds(120, 10, 100, 40);

        AutoCompleteDecorator.decorate(Worker_Name_Box);
        Worker_Name_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Worker_Name_Box.setEnabled(false);
        Worker_Name_Box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Worker_Name_BoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Workers_Schedule_Panel.add(Worker_Name_Box);
        Worker_Name_Box.setBounds(230, 10, 270, 40);

        Worker_Year.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Worker_Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        Worker_Year.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Worker_Year.setEnabled(false);
        Worker_Year.setFocusable(false);
        Worker_Year.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Worker_YearPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Workers_Schedule_Panel.add(Worker_Year);
        Worker_Year.setBounds(150, 80, 80, 30);

        Worker_Month.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Worker_Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Worker_Month.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Worker_Month.setEnabled(false);
        Worker_Month.setFocusable(false);
        Worker_Month.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Worker_MonthPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Workers_Schedule_Panel.add(Worker_Month);
        Worker_Month.setBounds(230, 80, 60, 30);

        Worker_Day.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Worker_Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        Worker_Day.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Worker_Day.setEnabled(false);
        Worker_Day.setFocusable(false);
        Worker_Day.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Worker_DayPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Workers_Schedule_Panel.add(Worker_Day);
        Worker_Day.setBounds(290, 80, 60, 30);

        Worker_Date_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Worker_Date_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_Date_Label.setText("Ημερομηνία");
        Worker_Date_Label.setFocusable(false);
        Workers_Schedule_Panel.add(Worker_Date_Label);
        Worker_Date_Label.setBounds(150, 60, 200, 20);

        Worker_Schedule_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Worker_Schedule_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Worker_Schedule_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Worker_Schedule_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Worker_Schedule_ListMouseReleased(evt);
            }
        });
        Worker_Schedule_Scroll.setViewportView(Worker_Schedule_List);

        Workers_Schedule_Panel.add(Worker_Schedule_Scroll);
        Worker_Schedule_Scroll.setBounds(20, 120, 480, 300);

        Panel1.add(Workers_Schedule_Panel, "Workers_Schedule_Panel");

        MainPanel.add(Panel1, "Panel1");

        Panel2.setLayout(new java.awt.CardLayout());

        Main_Salary_Panel.setLayout(null);

        Choose_Doctor_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Choose_Doctor_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Choose_Doctor_Label.setText("Επιλογή Εργασίας :");
        Choose_Doctor_Label.setFocusable(false);
        Main_Salary_Panel.add(Choose_Doctor_Label);
        Choose_Doctor_Label.setBounds(20, 20, 130, 40);

        Worker_Type_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Worker_Type_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Γιατρός", "Νοσοκόμος", "Γραμματέας", "Διευθυντής" }));
        Worker_Type_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Worker_Type_Box.setFocusable(false);
        Worker_Type_Box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Worker_Type_BoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Main_Salary_Panel.add(Worker_Type_Box);
        Worker_Type_Box.setBounds(160, 20, 140, 40);

        Workers_Name_List.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Workers_Name_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Workers_Name_List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Workers_Name_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Workers_Name_ListMouseReleased(evt);
            }
        });
        Workers_Name_Scroll.setViewportView(Workers_Name_List);

        Main_Salary_Panel.add(Workers_Name_Scroll);
        Workers_Name_Scroll.setBounds(20, 80, 470, 210);

        Salary_Confirm_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Salary_Confirm_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Check_Icon.png"))); // NOI18N
        Salary_Confirm_Button.setText("Επιβεβαίωση");
        Salary_Confirm_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salary_Confirm_Button.setEnabled(false);
        Salary_Confirm_Button.setFocusable(false);
        Salary_Confirm_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Salary_Confirm_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salary_Confirm_ButtonActionPerformed(evt);
            }
        });
        Main_Salary_Panel.add(Salary_Confirm_Button);
        Salary_Confirm_Button.setBounds(350, 385, 140, 30);

        Doctor_Salary_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Doctor_Salary_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Doctor_Salary_Label.setText("Μισθός :");
        Doctor_Salary_Label.setFocusable(false);
        Main_Salary_Panel.add(Doctor_Salary_Label);
        Doctor_Salary_Label.setBounds(350, 310, 140, 20);

        Doctor_Salary.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Doctor_Salary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Doctor_Salary.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Doctor_Salary.setEnabled(false);
        Doctor_Salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Doctor_SalaryKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Doctor_SalaryKeyTyped(evt);
            }
        });
        Main_Salary_Panel.add(Doctor_Salary);
        Doctor_Salary.setBounds(350, 330, 140, 40);

        Salary_Euro_Label0.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Salary_Euro_Label0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salary_Euro_Label0.setText("€");
        Main_Salary_Panel.add(Salary_Euro_Label0);
        Salary_Euro_Label0.setBounds(490, 330, 20, 40);

        Chosen_Doctor_Name.setEditable(false);
        Chosen_Doctor_Name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Chosen_Doctor_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Main_Salary_Panel.add(Chosen_Doctor_Name);
        Chosen_Doctor_Name.setBounds(20, 330, 150, 40);

        Chosen_Doctor_Name_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Chosen_Doctor_Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Chosen_Doctor_Name_Label.setText("ΟΝΟΜΑ");
        Main_Salary_Panel.add(Chosen_Doctor_Name_Label);
        Chosen_Doctor_Name_Label.setBounds(20, 310, 150, 20);

        Chosen_Doctor_LastName.setEditable(false);
        Chosen_Doctor_LastName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Chosen_Doctor_LastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Main_Salary_Panel.add(Chosen_Doctor_LastName);
        Chosen_Doctor_LastName.setBounds(185, 330, 150, 40);

        Chosen_Doctor_LastName_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Chosen_Doctor_LastName_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Chosen_Doctor_LastName_Label.setText("ΕΠΩΝΥΜΟ");
        Main_Salary_Panel.add(Chosen_Doctor_LastName_Label);
        Chosen_Doctor_LastName_Label.setBounds(185, 310, 150, 20);

        New_Worker_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        New_Worker_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/New_Message_Icon.png"))); // NOI18N
        New_Worker_Button.setText("ΝΕΟΣ ΕΡΓΑΖΟΜΕΝΟΣ");
        New_Worker_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        New_Worker_Button.setEnabled(false);
        New_Worker_Button.setFocusable(false);
        New_Worker_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_Worker_ButtonActionPerformed(evt);
            }
        });
        Main_Salary_Panel.add(New_Worker_Button);
        New_Worker_Button.setBounds(313, 20, 177, 40);

        Insert_Success_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Insert_Success_Label.setForeground(new java.awt.Color(51, 204, 0));
        Insert_Success_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insert_Success_Label.setText("ΕΠΙΤΥΧΗΣ ΕΙΣΑΓΩΓΗ");
        Insert_Success_Label.setFocusable(false);
        Main_Salary_Panel.add(Insert_Success_Label);
        Insert_Success_Label.setBounds(20, 380, 310, 40);

        Insert_Failure_Label.setVisible(false);
        Insert_Failure_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Insert_Failure_Label.setForeground(new java.awt.Color(255, 51, 51));
        Insert_Failure_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insert_Failure_Label.setText("ΑΝΕΠΙΤΥΧΗΣ ΕΙΣΑΓΩΓΗ");
        Insert_Failure_Label.setFocusable(false);
        Main_Salary_Panel.add(Insert_Failure_Label);
        Insert_Failure_Label.setBounds(20, 380, 310, 40);

        Panel2.add(Main_Salary_Panel, "Main_Salary_Panel");

        New_Worker_Panel.setLayout(null);

        Cancel_New_Worker_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Cancel_New_Worker_Button.setForeground(new java.awt.Color(255, 51, 51));
        Cancel_New_Worker_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Cancel_Icon.png"))); // NOI18N
        Cancel_New_Worker_Button.setText("ΑΚΥΡΩΣΗ");
        Cancel_New_Worker_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel_New_Worker_Button.setFocusPainted(false);
        Cancel_New_Worker_Button.setFocusable(false);
        Cancel_New_Worker_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_New_Worker_ButtonActionPerformed(evt);
            }
        });
        New_Worker_Panel.add(Cancel_New_Worker_Button);
        Cancel_New_Worker_Button.setBounds(270, 380, 140, 40);

        Insert_New_Worker_Button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Insert_New_Worker_Button.setForeground(new java.awt.Color(0, 204, 51));
        Insert_New_Worker_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Enter_Icon.png"))); // NOI18N
        Insert_New_Worker_Button.setText("ΕΙΣΑΓΩΓΗ");
        Insert_New_Worker_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Insert_New_Worker_Button.setEnabled(false);
        Insert_New_Worker_Button.setFocusPainted(false);
        Insert_New_Worker_Button.setFocusable(false);
        Insert_New_Worker_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Insert_New_Worker_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_New_Worker_ButtonActionPerformed(evt);
            }
        });
        New_Worker_Panel.add(Insert_New_Worker_Button);
        Insert_New_Worker_Button.setBounds(100, 380, 140, 40);

        Insert_Worker_Data_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Insert_Worker_Data_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insert_Worker_Data_Label.setText("ΕΙΣΑΓΕΤΕ ΤΑ ΣΤΟΙΧΕΙΑ ΤΟΥ ΕΡΓΑΖΟΜΕΝΟΥ");
        New_Worker_Panel.add(Insert_Worker_Data_Label);
        Insert_Worker_Data_Label.setBounds(20, 10, 480, 40);

        Worker_Username.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Worker_Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Worker_UsernameKeyReleased(evt);
            }
        });
        New_Worker_Panel.add(Worker_Username);
        Worker_Username.setBounds(20, 80, 150, 40);

        Worker_Password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_Worker_Panel.add(Worker_Password);
        Worker_Password.setBounds(185, 80, 150, 40);

        Worker_Email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_Worker_Panel.add(Worker_Email);
        Worker_Email.setBounds(350, 80, 150, 40);

        Worker_Name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_Worker_Panel.add(Worker_Name);
        Worker_Name.setBounds(20, 180, 150, 40);

        Worker_Lastname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Lastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_Worker_Panel.add(Worker_Lastname);
        Worker_Lastname.setBounds(185, 180, 150, 40);

        Worker_Birth_Year.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Worker_Birth_Year.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Worker_Birth_Year.setFocusable(false);
        Worker_Birth_Year.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Worker_Birth_YearPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        New_Worker_Panel.add(Worker_Birth_Year);
        Worker_Birth_Year.setBounds(350, 180, 60, 40);

        Worker_Birth_Month.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Worker_Birth_Month.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Worker_Birth_Month.setEnabled(false);
        Worker_Birth_Month.setFocusable(false);
        Worker_Birth_Month.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Worker_Birth_MonthPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        New_Worker_Panel.add(Worker_Birth_Month);
        Worker_Birth_Month.setBounds(409, 180, 45, 40);

        Worker_Birth_Day.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Worker_Birth_Day.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Worker_Birth_Day.setEnabled(false);
        Worker_Birth_Day.setFocusable(false);
        New_Worker_Panel.add(Worker_Birth_Day);
        Worker_Birth_Day.setBounds(453, 180, 45, 40);

        Worker_Telephone0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Telephone0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_Worker_Panel.add(Worker_Telephone0);
        Worker_Telephone0.setBounds(20, 280, 150, 20);

        Worker_Telephone1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Telephone1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_Worker_Panel.add(Worker_Telephone1);
        Worker_Telephone1.setBounds(20, 300, 150, 20);

        Worker_Adress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Adress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_Worker_Panel.add(Worker_Adress);
        Worker_Adress.setBounds(185, 280, 150, 40);

        Worker_Salary.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Salary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Worker_Salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Worker_SalaryKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Worker_SalaryKeyTyped(evt);
            }
        });
        New_Worker_Panel.add(Worker_Salary);
        Worker_Salary.setBounds(350, 280, 150, 40);

        Worker_Username_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Username_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_Username_Label.setText("ΟΝΟΜΑ ΧΡΗΣΤΗ");
        New_Worker_Panel.add(Worker_Username_Label);
        Worker_Username_Label.setBounds(20, 60, 150, 20);

        Worker_Password_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Password_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_Password_Label.setText("ΚΩΔΙΚΟΣ ΧΡΗΣΤΗ");
        New_Worker_Panel.add(Worker_Password_Label);
        Worker_Password_Label.setBounds(185, 60, 150, 20);

        Worker_Email_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Email_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_Email_Label.setText("E-Mail");
        New_Worker_Panel.add(Worker_Email_Label);
        Worker_Email_Label.setBounds(350, 60, 150, 20);

        Worker_Name_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_Name_Label.setText("ΟΝΟΜΑ");
        New_Worker_Panel.add(Worker_Name_Label);
        Worker_Name_Label.setBounds(20, 160, 150, 20);

        Worker_LastName_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_LastName_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_LastName_Label.setText("ΕΠΩΝΥΜΟ");
        New_Worker_Panel.add(Worker_LastName_Label);
        Worker_LastName_Label.setBounds(185, 160, 150, 20);

        Worker_Birthday_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Birthday_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_Birthday_Label.setText("ΗΜ/ΝΙΑ ΓΕΝΝΗΣΗΣ");
        New_Worker_Panel.add(Worker_Birthday_Label);
        Worker_Birthday_Label.setBounds(350, 160, 150, 20);

        Worker_Telephone_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Telephone_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_Telephone_Label.setText("ΤΗΛΕΦΩΝΑ");
        New_Worker_Panel.add(Worker_Telephone_Label);
        Worker_Telephone_Label.setBounds(20, 260, 150, 20);

        Worker_Adress_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Adress_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_Adress_Label.setText("ΔΙΕΥΘΥΝΣΗ");
        New_Worker_Panel.add(Worker_Adress_Label);
        Worker_Adress_Label.setBounds(185, 260, 150, 20);

        Worker_Salary_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Worker_Salary_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Worker_Salary_Label.setText("ΜΙΣΘΟΣ");
        New_Worker_Panel.add(Worker_Salary_Label);
        Worker_Salary_Label.setBounds(350, 260, 150, 20);

        Insert_Error_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Insert_Error_Label.setForeground(new java.awt.Color(255, 51, 51));
        Insert_Error_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insert_Error_Label.setText("ΥΠΑΡΧΕΙ ΛΑΘΟΣ ΣΤΑ ΣΤΟΙΧΕΙΑ");
        Insert_Error_Label.setFocusable(false);
        New_Worker_Panel.add(Insert_Error_Label);
        Insert_Error_Label.setBounds(20, 330, 480, 40);

        Panel2.add(New_Worker_Panel, "New_Worker_Panel");

        MainPanel.add(Panel2, "Panel2");

        Panel3.setLayout(null);
        Panel3.add(SeparatorHorTop1);
        SeparatorHorTop1.setBounds(22, 46, 220, 10);
        Panel3.add(SeparatorHorBot1);
        SeparatorHorBot1.setBounds(22, 415, 220, 10);

        SeperatorVerLef1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Panel3.add(SeperatorVerLef1);
        SeperatorVerLef1.setBounds(21, 46, 10, 370);

        SeperatorVerRig1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Panel3.add(SeperatorVerRig1);
        SeperatorVerRig1.setBounds(242, 46, 10, 370);
        Panel3.add(SeparatorHorTop2);
        SeparatorHorTop2.setBounds(271, 46, 219, 10);
        Panel3.add(SeparatorHorBot2);
        SeparatorHorBot2.setBounds(270, 415, 220, 10);

        SeperatorVerLef2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Panel3.add(SeperatorVerLef2);
        SeperatorVerLef2.setBounds(270, 46, 10, 370);

        SeperatorVerRig2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Panel3.add(SeperatorVerRig2);
        SeperatorVerRig2.setBounds(490, 46, 10, 370);

        Income_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Income_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Income_Label.setText("ΕΣΟΔΑ");
        Income_Label.setFocusable(false);
        Panel3.add(Income_Label);
        Income_Label.setBounds(20, 60, 220, 20);

        Patients_Income_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patients_Income_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Patients_Income_Label.setText("ΕΣΟΔΑ ΑΠΟ ΑΣΘΕΝΕΙΣ");
        Patients_Income_Label.setFocusable(false);
        Panel3.add(Patients_Income_Label);
        Patients_Income_Label.setBounds(50, 100, 160, 20);

        Medicines_Income_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Medicines_Income_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Medicines_Income_Label.setText("ΕΣΟΔΑ ΑΠΟ ΦΑΡΜΑΚΑ");
        Medicines_Income_Label.setFocusable(false);
        Panel3.add(Medicines_Income_Label);
        Medicines_Income_Label.setBounds(50, 170, 160, 20);

        Income_Total_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Income_Total_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Income_Total_Label.setText("ΣΥΝΟΛΟ ΕΣΟΔΩΝ");
        Income_Total_Label.setFocusable(false);
        Panel3.add(Income_Total_Label);
        Income_Total_Label.setBounds(50, 330, 160, 20);

        Patients_Income.setEditable(false);
        Patients_Income.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Patients_Income.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Patients_Income.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Panel3.add(Patients_Income);
        Patients_Income.setBounds(50, 120, 160, 40);

        Medicines_Income.setEditable(false);
        Medicines_Income.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Medicines_Income.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Medicines_Income.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Panel3.add(Medicines_Income);
        Medicines_Income.setBounds(50, 190, 160, 40);

        Income_Total.setEditable(false);
        Income_Total.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Income_Total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Income_Total.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Panel3.add(Income_Total);
        Income_Total.setBounds(50, 350, 160, 40);

        Outcome_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Outcome_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Outcome_Label.setText("ΕΞΟΔΑ");
        Outcome_Label.setFocusable(false);
        Panel3.add(Outcome_Label);
        Outcome_Label.setBounds(270, 60, 220, 20);

        Workers_Salary_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Workers_Salary_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Workers_Salary_Label.setText("ΜΙΣΘΟΙ ΕΡΓΑΖΟΜΕΝΩΝ");
        Workers_Salary_Label.setFocusable(false);
        Panel3.add(Workers_Salary_Label);
        Workers_Salary_Label.setBounds(300, 100, 160, 20);

        Medicine_Costs_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Medicine_Costs_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Medicine_Costs_Label.setText("ΕΞΟΔΑ ΑΠΟ ΦΑΡΜΑΚΑ");
        Medicine_Costs_Label.setFocusable(false);
        Panel3.add(Medicine_Costs_Label);
        Medicine_Costs_Label.setBounds(300, 170, 160, 20);

        Hospital_Costs_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Hospital_Costs_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hospital_Costs_Label.setText("ΕΞΟΔΑ ΝΟΣΟΚΟΜΕΙΟΥ");
        Hospital_Costs_Label.setFocusable(false);
        Panel3.add(Hospital_Costs_Label);
        Hospital_Costs_Label.setBounds(300, 240, 160, 20);

        Outcome_Total_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Outcome_Total_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Outcome_Total_Label.setText("ΣΥΝΟΛΟ ΕΞΟΔΩΝ");
        Outcome_Total_Label.setFocusable(false);
        Panel3.add(Outcome_Total_Label);
        Outcome_Total_Label.setBounds(300, 330, 160, 20);

        Workers_Salary.setEditable(false);
        Workers_Salary.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Workers_Salary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Workers_Salary.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Panel3.add(Workers_Salary);
        Workers_Salary.setBounds(300, 120, 160, 40);

        Medicine_Costs.setEditable(false);
        Medicine_Costs.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Medicine_Costs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Medicine_Costs.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Panel3.add(Medicine_Costs);
        Medicine_Costs.setBounds(300, 190, 160, 40);

        Hospital_Costs.setEditable(false);
        Hospital_Costs.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Hospital_Costs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Hospital_Costs.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Panel3.add(Hospital_Costs);
        Hospital_Costs.setBounds(300, 260, 160, 40);

        Outcome_Total.setEditable(false);
        Outcome_Total.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Outcome_Total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Outcome_Total.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Panel3.add(Outcome_Total);
        Outcome_Total.setBounds(300, 350, 160, 40);

        Date_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Date_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Date_Label.setText("ΗΜΕΡΟΜΗΝΙΑ");
        Date_Label.setFocusable(false);
        Panel3.add(Date_Label);
        Date_Label.setBounds(110, 10, 150, 30);

        Chosen_Year_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Chosen_Year_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Chosen_Year_Box.setFocusable(false);
        Chosen_Year_Box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Chosen_Year_BoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Panel3.add(Chosen_Year_Box);
        Chosen_Year_Box.setBounds(260, 10, 60, 30);

        Chosen_Month_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Chosen_Month_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Chosen_Month_Box.setFocusable(false);
        Chosen_Month_Box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Chosen_Month_BoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Panel3.add(Chosen_Month_Box);
        Chosen_Month_Box.setBounds(320, 10, 45, 30);

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
        Refresh_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh_ButtonActionPerformed(evt);
            }
        });
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

        Recepient.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Recepient.setText("ΠΑΡΑΛΗΠΤΗΣ:");
        Recepient.setFocusable(false);
        New_Message.add(Recepient);
        Recepient.setBounds(20, 10, 82, 40);

        Rec_Type_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Rec_Type_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Γιατρός", "Νοσοκόμος", "Γραμματέας", "Διευθυντής" }));
        Rec_Type_Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rec_Type_Box.setFocusable(false);
        Rec_Type_Box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Rec_Type_BoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        New_Message.add(Rec_Type_Box);
        Rec_Type_Box.setBounds(110, 10, 110, 40);

        AutoCompleteDecorator.decorate(Rec_Name_Box);
        Rec_Name_Box.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
        Rec_Name_Box.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Rec_Name_Box.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Rec_Name_BoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        New_Message.add(Rec_Name_Box);
        Rec_Name_Box.setBounds(230, 10, 270, 40);

        Message_Text.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
        Message_Text.setColumns(20);
        Message_Text.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Message_Text.setLineWrap(true);
        Message_Text.setRows(5);
        Message_Text.setWrapStyleWord(true);
        Message_Text.setEnabled(false);
        Message_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Message_TextKeyReleased(evt);
            }
        });
        Message_Area_Scroll.setViewportView(Message_Text);

        New_Message.add(Message_Area_Scroll);
        Message_Area_Scroll.setBounds(20, 70, 480, 300);

        Send_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Send_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Enter_Icon.png"))); // NOI18N
        Send_Button.setText("ΑΠΟΣΤΟΛΗ");
        Send_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Send_Button.setEnabled(false);
        Send_Button.setFocusable(false);
        Send_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Send_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Send_ButtonActionPerformed(evt);
            }
        });
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
        Message_Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Message_Delete_ButtonActionPerformed(evt);
            }
        });
        Message_Expanded.add(Message_Delete_Button);
        Message_Delete_Button.setBounds(20, 390, 200, 30);

        Panel5.add(Message_Expanded, "Message_Expanded");

        MainPanel.add(Panel5, "Panel5");

        Panel6.setLayout(null);

        Username.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Username);
        Username.setBounds(20, 80, 150, 40);

        Password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Password);
        Password.setBounds(185, 80, 150, 40);

        Email.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Email);
        Email.setBounds(350, 80, 150, 40);

        Name.setEditable(false);
        Name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Name);
        Name.setBounds(20, 180, 150, 40);

        LastName.setEditable(false);
        LastName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(LastName);
        LastName.setBounds(185, 180, 150, 40);

        Birth_Date.setEditable(false);
        Birth_Date.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Birth_Date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Birth_Date);
        Birth_Date.setBounds(350, 180, 150, 40);

        Tel_0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Tel_0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Tel_0);
        Tel_0.setBounds(20, 280, 150, 20);

        Tel_1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Tel_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Tel_1);
        Tel_1.setBounds(20, 300, 150, 20);

        Adress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Adress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Adress);
        Adress.setBounds(185, 280, 150, 40);

        Start_Date.setEditable(false);
        Start_Date.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start_Date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Panel6.add(Start_Date);
        Start_Date.setBounds(350, 280, 150, 40);

        Account_Update_Button.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Account_Update_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Enter_Icon.png"))); // NOI18N
        Account_Update_Button.setText("ΕΝΗΜΕΡΩΣΗ");
        Account_Update_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Account_Update_Button.setFocusable(false);
        Account_Update_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Account_Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Account_Update_ButtonActionPerformed(evt);
            }
        });
        Panel6.add(Account_Update_Button);
        Account_Update_Button.setBounds(185, 360, 150, 40);

        Edit_Information_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Edit_Information_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edit_Information_Label.setText("ΕΠΕΞΕΡΓΑΣΙΑ ΣΤΟΙΧΕΙΩΝ ΛΟΓΑΡΙΑΣΜΟΥ");
        Panel6.add(Edit_Information_Label);
        Edit_Information_Label.setBounds(60, 10, 390, 30);

        Username_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Username_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username_Label.setText("ΟΝΟΜΑ ΧΡΗΣΤΗ");
        Panel6.add(Username_Label);
        Username_Label.setBounds(20, 60, 150, 20);

        Password_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Password_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Password_Label.setText("ΚΩΔΙΚΟΣ ΧΡΗΣΤΗ");
        Panel6.add(Password_Label);
        Password_Label.setBounds(185, 60, 150, 20);

        Email_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Email_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Email_Label.setText("E-Mail");
        Panel6.add(Email_Label);
        Email_Label.setBounds(350, 60, 150, 20);

        Name_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Name_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_Label.setText("ΟΝΟΜΑ");
        Panel6.add(Name_Label);
        Name_Label.setBounds(20, 160, 150, 20);

        LastName_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LastName_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LastName_Label.setText("ΕΠΩΝΥΜΟ");
        Panel6.add(LastName_Label);
        LastName_Label.setBounds(185, 160, 150, 20);

        Birth_Date_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Birth_Date_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Birth_Date_Label.setText("ΗΜ/ΝΙΑ ΓΕΝΝΗΣΗΣ");
        Panel6.add(Birth_Date_Label);
        Birth_Date_Label.setBounds(350, 160, 150, 20);

        Tel_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Tel_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tel_Label.setText("ΤΗΛΕΦΩΝΑ");
        Panel6.add(Tel_Label);
        Tel_Label.setBounds(20, 260, 150, 20);

        Adress_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Adress_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Adress_Label.setText("ΔΙΕΥΘΥΝΣΗ");
        Panel6.add(Adress_Label);
        Adress_Label.setBounds(185, 260, 150, 20);

        Start_Date_Label.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Start_Date_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Start_Date_Label.setText("ΕΝΑΡΞΗ ΕΡΓΑΣΙΑΣ");
        Panel6.add(Start_Date_Label);
        Start_Date_Label.setBounds(350, 260, 150, 20);

        MainPanel.add(Panel6, "Panel6");

        getContentPane().add(MainPanel);
        MainPanel.setBounds(258, 15, 520, 440);

        Button0.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Button0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Calendar_Icon.png"))); // NOI18N
        Button0.setText("Πρόγραμμα Ημέρας");
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
        Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Worker_Hours_Icon.png"))); // NOI18N
        Button1.setText("Πρόγ/μα Εργαζομένων");
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
        Button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Salaries_Icon.png"))); // NOI18N
        Button2.setText("Μισθοδοσίες");
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
        Button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MedX/images/Incomes_Icon.png"))); // NOI18N
        Button3.setText("Έσοδα / Έξοδα");
        Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button3.setFocusPainted(false);
        Button3.setFocusable(false);
        Button3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
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
        Button4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
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
    String user=null;
    int hour_selected=0;
    String worker_history_chosen=null;
    String chosen_job=null;
    String chosen_worker=null;
    String chosen_receiver=null;
    Integer year_budget=0;
    Integer month_budget=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Account_Update_Button;
    private javax.swing.JTextField Adress;
    private javax.swing.JLabel Adress_Label;
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JLabel BackgroundMedX;
    private javax.swing.JTextField Birth_Date;
    private javax.swing.JLabel Birth_Date_Label;
    private javax.swing.JToggleButton Button0;
    private javax.swing.JToggleButton Button1;
    private javax.swing.JToggleButton Button2;
    private javax.swing.JToggleButton Button3;
    private javax.swing.JToggleButton Button4;
    private javax.swing.JToggleButton Button5;
    private javax.swing.JToggleButton Button6;
    private javax.swing.JButton Cancel_Button;
    private javax.swing.JButton Cancel_New_Worker_Button;
    private javax.swing.JLabel Choose_Doctor_Label;
    private javax.swing.JTextField Chosen_Doctor_LastName;
    private javax.swing.JLabel Chosen_Doctor_LastName_Label;
    private javax.swing.JTextField Chosen_Doctor_Name;
    private javax.swing.JLabel Chosen_Doctor_Name_Label;
    private javax.swing.JComboBox<String> Chosen_Month_Box;
    private javax.swing.JComboBox<String> Chosen_Year_Box;
    private javax.swing.JLabel Date_Label;
    private javax.swing.JTextField Doctor_Salary;
    private javax.swing.JLabel Doctor_Salary_Label;
    private javax.swing.JLabel Edit_Information_Label;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel Email_Label;
    private javax.swing.JTextField Hospital_Costs;
    private javax.swing.JLabel Hospital_Costs_Label;
    private javax.swing.JLabel Income_Label;
    private javax.swing.JTextField Income_Total;
    private javax.swing.JLabel Income_Total_Label;
    private javax.swing.JList<String> Incoming_List;
    private javax.swing.JPanel Incoming_Panel;
    private javax.swing.JScrollPane Incoming_Scroll;
    private javax.swing.JLabel Insert_Error_Label;
    private javax.swing.JLabel Insert_Failure_Label;
    private javax.swing.JButton Insert_New_Worker_Button;
    private javax.swing.JLabel Insert_Success_Label;
    private javax.swing.JLabel Insert_Worker_Data_Label;
    private javax.swing.JTextField LastName;
    private javax.swing.JLabel LastName_Label;
    private javax.swing.JButton Logout_Button;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Main_Messages;
    private javax.swing.JPanel Main_Salary_Panel;
    private javax.swing.JPanel Main_Schedule_Panel;
    private javax.swing.JTextField Medicine_Costs;
    private javax.swing.JLabel Medicine_Costs_Label;
    private javax.swing.JTextField Medicines_Income;
    private javax.swing.JLabel Medicines_Income_Label;
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
    private javax.swing.JTextField Name;
    private javax.swing.JLabel Name_Label;
    private javax.swing.JPanel New_Message;
    private javax.swing.JButton New_Message_Button;
    private javax.swing.JButton New_Worker_Button;
    private javax.swing.JPanel New_Worker_Panel;
    private javax.swing.JLabel Outcome_Label;
    private javax.swing.JTextField Outcome_Total;
    private javax.swing.JLabel Outcome_Total_Label;
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
    private javax.swing.JTextField Password;
    private javax.swing.JLabel Password_Label;
    private javax.swing.JTextField Patients_Income;
    private javax.swing.JLabel Patients_Income_Label;
    private javax.swing.JComboBox<String> Rec_Name_Box;
    private javax.swing.JComboBox<String> Rec_Type_Box;
    private javax.swing.JLabel Recepient;
    private javax.swing.JButton Refresh_Button;
    private javax.swing.JButton Return_Button_Message_Expanded;
    private javax.swing.JButton Return_Button_Schedule;
    private javax.swing.JButton Salary_Confirm_Button;
    private javax.swing.JLabel Salary_Euro_Label0;
    private javax.swing.JList<String> Schedule_Expanded_List;
    private javax.swing.JPanel Schedule_Expanded_Panel;
    private javax.swing.JScrollPane Schedule_Expanded_Scroll;
    private javax.swing.JLabel Schedule_Label;
    private javax.swing.JList<String> Schedule_List;
    private javax.swing.JScrollPane Schedule_List_Scroll;
    private javax.swing.JButton Send_Button;
    private javax.swing.JSeparator SeparatorHorBot1;
    private javax.swing.JSeparator SeparatorHorBot2;
    private javax.swing.JSeparator SeparatorHorTop;
    private javax.swing.JSeparator SeparatorHorTop1;
    private javax.swing.JSeparator SeparatorHorTop2;
    private javax.swing.JSeparator SeperatorHorBot;
    private javax.swing.JSeparator SeperatorVerLef;
    private javax.swing.JSeparator SeperatorVerLef1;
    private javax.swing.JSeparator SeperatorVerLef2;
    private javax.swing.JSeparator SeperatorVerRig;
    private javax.swing.JSeparator SeperatorVerRig1;
    private javax.swing.JSeparator SeperatorVerRig2;
    private javax.swing.JTextField Start_Date;
    private javax.swing.JLabel Start_Date_Label;
    private javax.swing.JTextField Tel_0;
    private javax.swing.JTextField Tel_1;
    private javax.swing.JLabel Tel_Label;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel Username_Label;
    private javax.swing.JTextField Worker_Adress;
    private javax.swing.JLabel Worker_Adress_Label;
    private javax.swing.JComboBox<String> Worker_Birth_Day;
    private javax.swing.JComboBox<String> Worker_Birth_Month;
    private javax.swing.JComboBox<String> Worker_Birth_Year;
    private javax.swing.JLabel Worker_Birthday_Label;
    private javax.swing.JLabel Worker_Date_Label;
    private javax.swing.JComboBox<String> Worker_Day;
    private javax.swing.JTextField Worker_Email;
    private javax.swing.JLabel Worker_Email_Label;
    private javax.swing.JLabel Worker_Label;
    private javax.swing.JLabel Worker_LastName_Label;
    private javax.swing.JTextField Worker_Lastname;
    private javax.swing.JComboBox<String> Worker_Month;
    private javax.swing.JTextField Worker_Name;
    private javax.swing.JComboBox<String> Worker_Name_Box;
    private javax.swing.JLabel Worker_Name_Label;
    private javax.swing.JTextField Worker_Password;
    private javax.swing.JLabel Worker_Password_Label;
    private javax.swing.JTextField Worker_Salary;
    private javax.swing.JLabel Worker_Salary_Label;
    private javax.swing.JList<String> Worker_Schedule_List;
    private javax.swing.JScrollPane Worker_Schedule_Scroll;
    private javax.swing.JTextField Worker_Telephone0;
    private javax.swing.JTextField Worker_Telephone1;
    private javax.swing.JLabel Worker_Telephone_Label;
    private javax.swing.JComboBox<String> Worker_Type_Box;
    private javax.swing.JComboBox<String> Worker_Type_List;
    private javax.swing.JTextField Worker_Username;
    private javax.swing.JLabel Worker_Username_Label;
    private javax.swing.JComboBox<String> Worker_Year;
    private javax.swing.JList<String> Workers_Name_List;
    private javax.swing.JScrollPane Workers_Name_Scroll;
    private javax.swing.JTextField Workers_Salary;
    private javax.swing.JLabel Workers_Salary_Label;
    private javax.swing.JPanel Workers_Schedule_Panel;
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
        if(Button0.isSelected()) Load_Schedule();
        Check_Button(Button0);
    }//GEN-LAST:event_Button0ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        Check_Button(Button1);
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        if(Button2.isSelected()) {
            Insert_Success_Label.setVisible(false);
            Load_Worker_Type_Box();
        }
        Check_Button(Button2);
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        if(Button3.isSelected()) {
            Load_Time_Boxes();
            Load_Budget();
        }
        Check_Button(Button3);
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        Check_Button(Button4);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        if(Button5.isSelected()) {
            Load_Incoming_Messages();
            Load_Outgoing_Messages();
        }
        Check_Button(Button5);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        if(Button6.isSelected()) Load_Account();
        Check_Button(Button6);
    }//GEN-LAST:event_Button6ActionPerformed

    private void Logout_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_ButtonActionPerformed
        LoginScreen l = new LoginScreen(conn);
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Logout_ButtonActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel0">
    private void Load_Schedule(){
        Calendar cal = Calendar.getInstance();
        java.util.Date today = new java.util.Date();
        cal.setTime(today);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour=0;
        Schedule_Label.setText("ΠΡΟΓΡΑΜΜΑ ΗΜΕΡΑΣ : "+year+"-"+month+"-"+day);
        DefaultListModel model = new DefaultListModel();
        ArrayList schedule = new ArrayList();
        try{
            String query = "select count(time) as count,time from worker_schedule where date between '"+year+"-"+month+"-"+day+" 00:00:00' AND '"+year+"-"+month+"-"+(day+1)+" 23:59:59' order by time ASC";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                String[] time=rs.getString("time").split(":");
                hour=Integer.parseInt(time[0]);
                for(int i=0;i<24;i++) {
                    if(i==hour && rs.getInt("count")==1) schedule.add("Στις "+i+":00-"+(i+1)+":00 έχει ραντεβού "+rs.getString("count")+" εργαζόμενος.");
                    else if(i==hour) schedule.add("Στις "+i+":00-"+(i+1)+":00 έχουν ραντεβού "+rs.getString("count")+" εργαζόμενοι.");
                }
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        for(int i=0;i<schedule.size();i++) {
            
            model.addElement(schedule.get(i));
        }
        Schedule_List.setModel(model);
    }
    
    private void Load_Schedule_Expanded() {
        Calendar cal = Calendar.getInstance();
        java.util.Date today = new java.util.Date();
        cal.setTime(today);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        ArrayList schedule = new ArrayList();
        try{
            String query = "select users.username,name,lastname,time from worker_schedule inner join users on users.username=worker_schedule.username where date between '"+year+"-"+month+"-"+day+" 00:00:00' AND '"+year+"-"+month+"-"+(day+1)+" 23:59:59' order by time ASC";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                schedule.add("Ο "+rs.getString("name")+" "+rs.getString("lastname")+" | "+rs.getString("username")+" | έχει ραντεβού στις "+rs.getTime("time"));
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        Schedule_Expanded_List.setModel(new DefaultComboBoxModel(schedule.toArray()));
    }
    
    private void Schedule_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Schedule_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2 && Schedule_List.getSelectedIndex() != -1) {
            CardLayout card = (CardLayout)Panel0.getLayout();
            card.show(Panel0, "Schedule_Expanded_Panel");
            Load_Schedule_Expanded();
        }
    }//GEN-LAST:event_Schedule_ListMouseReleased

    private void Return_Button_ScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_Button_ScheduleActionPerformed
        CardLayout card = (CardLayout)Panel0.getLayout();
        card.show(Panel0, "Main_Schedule_Panel");
    }//GEN-LAST:event_Return_Button_ScheduleActionPerformed

    private void Schedule_Expanded_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Schedule_Expanded_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2 && Schedule_Expanded_List.getSelectedIndex() != -1) {
            CardLayout card = (CardLayout)MainPanel.getLayout();
            card.show(MainPanel, "Panel1");
            Button1.setSelected(true);
            Button1.setEnabled(true);
            Button0.setSelected(false);
            Button0.setEnabled(false);
            Check_Button(Button1);
            String[] worker=Schedule_Expanded_List.getSelectedValue().split(" \\| ");
            worker_history_chosen=worker[1];
        }
    }//GEN-LAST:event_Schedule_Expanded_ListMouseReleased
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel1">
    private void Load_Worker_Type_List(){
        ArrayList jobs = new ArrayList();
        jobs.add(null);
        jobs.add("Γιατρός");
        jobs.add("Νοσηλευτής");
        jobs.add("Γραμματέας");
        jobs.add("Αποθηκάριος");
        jobs.add("Διευθυντής");
        Worker_Type_List.setModel(new DefaultComboBoxModel(jobs.toArray()));
    }
    
    private void Load_Worker_Name_Box(String job){
        String[] worker=new String[2];
        ArrayList workers = new ArrayList();
        workers.add(null);
        try{
            String query = "select username,name,lastname from users where job='"+job+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                workers.add(rs.getString("name")+" "+rs.getString("lastname")+" | "+rs.getString("username"));
                if(worker_history_chosen!=null && worker_history_chosen.equals(rs.getString("username"))) {
                    worker[0]=rs.getString("name")+" "+rs.getString("lastname");
                    worker[1]=worker_history_chosen;
                }
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        Worker_Name_Box.setModel(new DefaultComboBoxModel(workers.toArray()));
        if(worker_history_chosen!=null) Worker_Name_Box.setSelectedItem(worker[0]+" | "+worker[1]);
    }
    
    private void Load_Worker_Year_Month_Hours(){
        LocalDate localDate = LocalDate.now();
        ArrayList temp = new ArrayList();
        temp.add(null);
        temp.add(localDate.getYear());
        Worker_Year.setModel(new DefaultComboBoxModel(temp.toArray()));
        temp.clear();
        temp.add(null);
        for(int i=1;i<=12;i++) temp.add(i);
        Worker_Month.setModel(new DefaultComboBoxModel(temp.toArray()));
    }
    
    private void Load_Worker_Schedule(){
        if((String.valueOf(Worker_Type_List.getSelectedItem()).equals("Γιατρός"))) {
            int year = (Integer)Worker_Year.getSelectedItem();
            int month = (Integer)Worker_Month.getSelectedItem();
            int day = (Integer)Worker_Day.getSelectedItem();
            int hour=0;
            DefaultListModel model = new DefaultListModel();
            ArrayList schedule = new ArrayList();
            try{
            String query = "select count(AMKA) as count,time from patient_appointment where doc_user='"+worker_history_chosen+"' and date between '"+year+"-"+month+"-"+day+" 00:00:00' AND '"+year+"-"+month+"-"+(day+1)+" 23:59:59' order by time ASC";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                String[] time=rs.getString("time").split(":");
                hour=Integer.parseInt(time[0]);
                for(int i=0;i<24;i++) {
                    if(i==hour && rs.getInt("count")==1) schedule.add("Στις "+i+":00-"+(i+1)+":00 έχει "+rs.getString("count")+" ασθενή.");
                    else if(i==hour) schedule.add("Στις "+i+":00-"+(i+1)+":00 έχει "+rs.getString("count")+" ασθενείς.");
                }
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        for(int i=0;i<schedule.size();i++) {
            
            model.addElement(schedule.get(i));
        }
        Worker_Schedule_List.setModel(model);
        }
        else if((String.valueOf(Worker_Type_List.getSelectedItem()).equals("Νοσηλευτής"))){
        
        }
        else if((String.valueOf(Worker_Type_List.getSelectedItem()).equals("Γραμματέας"))){
            System.out.println("grammateas");
        DefaultListModel model = new DefaultListModel();
        ArrayList schedule = new ArrayList();
        try{
            String query = "select count(AMKA) as count,check_time from patient_treatment where check_out='1'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                String[] time=rs.getString("check_time").split(":");
                int hour=Integer.parseInt(time[0]);
                for(int i=0;i<24;i++) {
                    if(i==hour && rs.getInt("count")==1) schedule.add("Στις "+i+":00-"+(i+1)+":00 βγήκε "+rs.getString("count")+" εξιτήριο.");
                    else if(i==hour) schedule.add("Στις "+i+":00-"+(i+1)+":00 βγήκαν "+rs.getString("count")+" ασθενείς.");
                }
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        for(int i=0;i<schedule.size();i++) {
            
            model.addElement(schedule.get(i));
        }
        Worker_Schedule_List.setModel(model);
        }
    }

    private void Worker_Type_ListPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Worker_Type_ListPopupMenuWillBecomeInvisible
        worker_history_chosen=null;
        Worker_Year.setEnabled(false);
        Worker_Year.setSelectedItem(null);
        Worker_Month.setEnabled(false);
        Worker_Month.setSelectedItem(null);
        Worker_Day.setEnabled(false);
        Worker_Day.setSelectedItem(null);
        if(Worker_Type_List.getSelectedItem() == null) {
            Worker_Name_Box.setEnabled(false);
            Worker_Name_Box.setSelectedItem(null);
        }
        else {
            Worker_Name_Box.setEnabled(true);
            Load_Worker_Name_Box(String.valueOf(Worker_Type_List.getSelectedItem()));
        }
    }//GEN-LAST:event_Worker_Type_ListPopupMenuWillBecomeInvisible

    private void Worker_Name_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Worker_Name_BoxPopupMenuWillBecomeInvisible
        worker_history_chosen=null;
        Worker_Month.setEnabled(false);
        Worker_Month.setSelectedItem(null);
        Worker_Day.setEnabled(false);
        Worker_Day.setSelectedItem(null);
        if(Worker_Name_Box.getSelectedItem() == null) {
            Worker_Year.setEnabled(false);
            Worker_Year.setSelectedItem(null);
        }
        else {
            Worker_Year.setEnabled(true);
            String[] worker=(String.valueOf(Worker_Name_Box.getSelectedItem())).split(" \\| ");
            worker_history_chosen=worker[1];
            Load_Worker_Year_Month_Hours();
        }
    }//GEN-LAST:event_Worker_Name_BoxPopupMenuWillBecomeInvisible

    private void Worker_YearPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Worker_YearPopupMenuWillBecomeInvisible
        Worker_Day.setEnabled(false);
        Worker_Month.setSelectedItem(null);
        Worker_Day.setSelectedItem(null);
        if(Worker_Year.getSelectedItem()==null){
            Worker_Month.setEnabled(false);
        }else Worker_Month.setEnabled(true);
    }//GEN-LAST:event_Worker_YearPopupMenuWillBecomeInvisible

    private void Worker_MonthPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Worker_MonthPopupMenuWillBecomeInvisible
        Worker_Day.setSelectedItem(null);
        if(Worker_Month.getSelectedItem()==null){
            Worker_Day.setEnabled(false);
        }else{
            ArrayList day = new ArrayList();
            day.add(null);
            Worker_Day.setEnabled(true);
            int i=Integer.valueOf(String.valueOf(Worker_Month.getSelectedItem()));
            int last_day=0;
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) last_day=31;
            if(i==4 || i==6 || i==9 || i==11) last_day=30;
            if(i==2) last_day=28;
            for(int j=1;j<=last_day;j++) day.add(j);
            Worker_Day.setModel(new DefaultComboBoxModel(day.toArray()));
        }
    }//GEN-LAST:event_Worker_MonthPopupMenuWillBecomeInvisible

    private void Worker_DayPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Worker_DayPopupMenuWillBecomeInvisible
        if(Worker_Day.getSelectedItem()==null){
            
        }else{
            Load_Worker_Schedule();
        }
    }//GEN-LAST:event_Worker_DayPopupMenuWillBecomeInvisible
    
    private void Worker_Schedule_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Worker_Schedule_ListMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Worker_Schedule_ListMouseReleased
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel2">
    private void Load_Worker_Type_Box() {
        ArrayList jobs = new ArrayList();
        jobs.add(null);
        jobs.add("Γιατρός");
        jobs.add("Νοσηλευτής");
        jobs.add("Γραμματέας");
        jobs.add("Αποθηκάριος");
        jobs.add("Διευθυντής");
        Worker_Type_Box.setModel(new DefaultComboBoxModel(jobs.toArray()));
        Worker_Type_Box.setSelectedItem(chosen_job);
    }
    
    private void Load_Worker_Name_List() {
        ArrayList workers = new ArrayList();
        workers.clear();
        try{
            String query = "select username,name,lastname from users where job='"+String.valueOf(Worker_Type_Box.getSelectedItem())+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                workers.add(rs.getString("name")+" "+rs.getString("lastname")+" | "+rs.getString("username"));
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        Workers_Name_List.setModel(new DefaultComboBoxModel(workers.toArray()));
    }
    
    public void Int_Typed(KeyEvent e) {
      char c = e.getKeyChar();
      if (!( ((c >= '0') && (c <= '9')) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        e.consume();
      }
    }
    
    private void Worker_Type_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Worker_Type_BoxPopupMenuWillBecomeInvisible
        Insert_Success_Label.setVisible(false);
        Insert_Failure_Label.setVisible(false);
        chosen_job=String.valueOf(Worker_Type_Box.getSelectedItem());
        Chosen_Doctor_Name.setText(null);
        Chosen_Doctor_LastName.setText(null);
        Doctor_Salary.setText(null);
        Doctor_Salary.setEnabled(false);
        Salary_Confirm_Button.setEnabled(false);
        if(Worker_Type_Box.getSelectedItem()==null) New_Worker_Button.setEnabled(false);
        else New_Worker_Button.setEnabled(true);
        Load_Worker_Name_List();
    }//GEN-LAST:event_Worker_Type_BoxPopupMenuWillBecomeInvisible

    private void Workers_Name_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Workers_Name_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2 && Workers_Name_List.getSelectedIndex() != -1) {
            Insert_Success_Label.setVisible(false);
            Insert_Failure_Label.setVisible(false);
            Doctor_Salary.setEnabled(true);
            String temp=Workers_Name_List.getSelectedValue();
            String[] name=temp.split(" \\| ");
            chosen_worker=name[1];
            try{
                String query = "select name,lastname,salary from users inner join salaries on salaries.username=users.username where users.username='"+chosen_worker+"'";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next()){
                    Chosen_Doctor_Name.setText(rs.getString("name"));
                    Chosen_Doctor_LastName.setText(rs.getString("lastname"));
                    Doctor_Salary.setText(rs.getString("salary"));
                }
                rs.close();
                stmt.close();
            }catch(Exception e){System.out.println(e.getMessage());};
        }
    }//GEN-LAST:event_Workers_Name_ListMouseReleased

    private void Salary_Confirm_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salary_Confirm_ButtonActionPerformed
        Insert_Success_Label.setVisible(false);
        Insert_Failure_Label.setVisible(false);
        try{
            String query = "update salaries set salary=? where salaries.username='"+chosen_worker+"'";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,Doctor_Salary.getText());
            pstmt.executeUpdate();
            pstmt.close();
            Insert_Success_Label.setVisible(true);
        }catch(Exception e){Insert_Failure_Label.setVisible(true); System.out.println(e.getMessage());};
    }//GEN-LAST:event_Salary_Confirm_ButtonActionPerformed

    private void Doctor_SalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Doctor_SalaryKeyTyped
        Int_Typed(evt);
    }//GEN-LAST:event_Doctor_SalaryKeyTyped

    private void Doctor_SalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Doctor_SalaryKeyReleased
        if(Doctor_Salary.getText().equals("")) Salary_Confirm_Button.setEnabled(false);
        else Salary_Confirm_Button.setEnabled(true);
    }//GEN-LAST:event_Doctor_SalaryKeyReleased
    
    private void Load_Worker_Birth_Year(){
        LocalDate localDate = LocalDate.now();
        ArrayList year_month = new ArrayList();
        year_month.add(null);
        for(int i=localDate.getYear()-70;i<=localDate.getYear();i++) year_month.add(i);
        Worker_Birth_Year.setModel(new DefaultComboBoxModel(year_month.toArray()));
        year_month.clear();
        year_month.add(null);
        for(int i=1;i<=12;i++) {
            if(i<10) year_month.add("0"+String.valueOf(i));
            else year_month.add(i);
        }
        Worker_Birth_Month.setModel(new DefaultComboBoxModel(year_month.toArray()));
    }
    
    private void New_Worker_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_Worker_ButtonActionPerformed
        Insert_Success_Label.setVisible(false);
        Insert_Failure_Label.setVisible(false);
        Worker_Username.setText(null);
        Worker_Password.setText(null);
        Worker_Email.setText(null);
        Worker_Name.setText(null);
        Worker_Lastname.setText(null);
        Worker_Birth_Year.setSelectedItem(null);
        Worker_Birth_Month.setSelectedItem(null);
        Worker_Birth_Day.setSelectedItem(null);        
        Worker_Telephone0.setText(null);
        Worker_Telephone1.setText(null);
        Worker_Adress.setText(null);
        Worker_Salary.setText(null);
        Insert_New_Worker_Button.setEnabled(false);
        Insert_Error_Label.setVisible(false);
        if(String.valueOf(Worker_Type_Box.getSelectedItem()).equals("Γιατρός")) Insert_Worker_Data_Label.setText("ΕΙΣΑΓΕΤΕ ΤΑ ΣΤΟΙΧΕΙΑ ΤΟΥ ΓΙΑΤΡΟΥ");
        if(String.valueOf(Worker_Type_Box.getSelectedItem()).equals("Νοσηλευτής")) Insert_Worker_Data_Label.setText("ΕΙΣΑΓΕΤΕ ΤΑ ΣΤΟΙΧΕΙΑ ΤΟΥ ΝΟΣΗΛΕΥΤΗ");
        if(String.valueOf(Worker_Type_Box.getSelectedItem()).equals("Γραμματέας")) Insert_Worker_Data_Label.setText("ΕΙΣΑΓΕΤΕ ΤΑ ΣΤΟΙΧΕΙΑ ΤΟΥ ΓΡΑΜΜΑΤΕΑ");
        if(String.valueOf(Worker_Type_Box.getSelectedItem()).equals("Αποθηκάριος")) Insert_Worker_Data_Label.setText("ΕΙΣΑΓΕΤΕ ΤΑ ΣΤΟΙΧΕΙΑ ΤΟΥ ΑΠΟΘΗΚΑΡΙΟΥ");
        if(String.valueOf(Worker_Type_Box.getSelectedItem()).equals("Διευθυντής")) Insert_Worker_Data_Label.setText("ΕΙΣΑΓΕΤΕ ΤΑ ΣΤΟΙΧΕΙΑ ΤΟΥ ΔΙΕΥΘΥΝΤΗ");
        Load_Worker_Birth_Year();
        CardLayout card = (CardLayout)Panel2.getLayout();
        card.show(Panel2, "New_Worker_Panel");
    }//GEN-LAST:event_New_Worker_ButtonActionPerformed

    private void Worker_Birth_YearPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Worker_Birth_YearPopupMenuWillBecomeInvisible
        if(Worker_Birth_Year.getSelectedItem()==null){
            Worker_Birth_Month.setEnabled(false);
            Worker_Birth_Month.setSelectedItem(null);
            Worker_Birth_Day.setEnabled(false);
            Worker_Birth_Day.setSelectedItem(null);
        }else Worker_Birth_Month.setEnabled(true);
    }//GEN-LAST:event_Worker_Birth_YearPopupMenuWillBecomeInvisible

    private void Worker_Birth_MonthPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Worker_Birth_MonthPopupMenuWillBecomeInvisible
        if(Worker_Birth_Month.getSelectedItem()==null){
            Worker_Birth_Day.setEnabled(false);
            Worker_Birth_Day.setSelectedItem(null);
        }else{
            ArrayList day = new ArrayList();
            day.add(null);
            Worker_Birth_Day.setEnabled(true);
            int i=Integer.valueOf(String.valueOf(Worker_Birth_Month.getSelectedItem()));
            int last_day=0;
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) last_day=31;
            if(i==4 || i==6 || i==9 || i==11) last_day=30;
            if(i==2) last_day=28;
            for(int j=1;j<=last_day;j++) {
                if(j<10) day.add("0"+String.valueOf(j));
                else day.add(j);
            }
            Worker_Birth_Day.setModel(new DefaultComboBoxModel(day.toArray()));
        }
    }//GEN-LAST:event_Worker_Birth_MonthPopupMenuWillBecomeInvisible

    private void Worker_UsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Worker_UsernameKeyReleased
        if(Worker_Username.getText().equals("") || Worker_Salary.getText().equals("")) Insert_New_Worker_Button.setEnabled(false);
        else Insert_New_Worker_Button.setEnabled(true);
    }//GEN-LAST:event_Worker_UsernameKeyReleased

    private void Worker_SalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Worker_SalaryKeyTyped
        Int_Typed(evt);
    }//GEN-LAST:event_Worker_SalaryKeyTyped

    private void Worker_SalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Worker_SalaryKeyReleased
        if(Worker_Username.getText().equals("") || Worker_Salary.getText().equals("")) Insert_New_Worker_Button.setEnabled(false);
        else Insert_New_Worker_Button.setEnabled(true);
    }//GEN-LAST:event_Worker_SalaryKeyReleased

    private void Cancel_New_Worker_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_New_Worker_ButtonActionPerformed
        CardLayout card = (CardLayout)Panel2.getLayout();
        card.show(Panel2, "Main_Salary_Panel");
    }//GEN-LAST:event_Cancel_New_Worker_ButtonActionPerformed

    private void Insert_New_Worker_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_New_Worker_ButtonActionPerformed
        try{  //insert stoixeia
            String query = "insert into users (job,username,password,email,name,lastname,birth_date,tel_0,tel_1,address,start_date) values (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,String.valueOf(Worker_Type_Box.getSelectedItem()));
            pstmt.setString(2,Worker_Username.getText());
            pstmt.setString(3,Worker_Password.getText());
            pstmt.setString(4,Worker_Email.getText());
            pstmt.setString(5,Worker_Name.getText());
            pstmt.setString(6,Worker_Lastname.getText());
            String birth_date=String.valueOf(Worker_Birth_Year.getSelectedItem())+"-"+String.valueOf(Worker_Birth_Month.getSelectedItem())+"-"+String.valueOf(Worker_Birth_Day.getSelectedItem());
            pstmt.setDate(7,Date.valueOf(birth_date)); 
            pstmt.setString(8,Worker_Telephone0.getText());
            pstmt.setString(9,Worker_Telephone1.getText());
            pstmt.setString(10,Worker_Adress.getText());
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.now();
            pstmt.setDate(11,Date.valueOf(dtf.format(localDate)));
            pstmt.executeUpdate();
            pstmt.close();
            try{  //insert misthos
                query = "insert into salaries (username,salary) values (?,?)";
                pstmt = conn.prepareStatement(query);
                pstmt.setString(1,Worker_Username.getText());
                pstmt.setString(2,Worker_Salary.getText());
                pstmt.executeUpdate();
                pstmt.close();
                CardLayout card = (CardLayout)Panel2.getLayout();
                card.show(Panel2, "Main_Salary_Panel");
                Load_Worker_Name_List();
                Insert_Success_Label.setVisible(true);
            }catch(Exception e){try{Insert_Error_Label.setVisible(true); 
                                    query = "delete from users where username='"+Worker_Username.getText()+"'";
                                    pstmt = conn.prepareStatement(query);
                                    pstmt.executeUpdate();
                                    pstmt.close();
                                }catch(Exception e2){System.out.println(e2.getMessage());};
                                System.out.println(e.getMessage());};
        }catch(Exception e){Insert_Error_Label.setVisible(true); System.out.println(e.getMessage());};
        
    }//GEN-LAST:event_Insert_New_Worker_ButtonActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel3">
    private void Load_Time_Boxes(){
        ArrayList years = new ArrayList();
        ArrayList months = new ArrayList();
        try{
            String query = "select distinct year from outcome";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                years.add(rs.getInt("year"));
            }
            rs.close();
            stmt.close();
            Chosen_Year_Box.setModel(new DefaultComboBoxModel(years.toArray()));
            if(year_budget==0) {
                Chosen_Year_Box.setSelectedIndex(Chosen_Year_Box.getItemCount()-1);
                year_budget=(Integer)Chosen_Year_Box.getSelectedItem();
            }
            Chosen_Year_Box.setSelectedItem(year_budget);
            query = "select distinct month from outcome";
            stmt = conn.createStatement();
             rs = stmt.executeQuery(query);
            while(rs.next()){
                months.add(rs.getInt("month"));
            }
            rs.close();
            stmt.close();
            Chosen_Month_Box.setModel(new DefaultComboBoxModel(months.toArray()));
            if(month_budget==0) {
                Chosen_Month_Box.setSelectedIndex(Chosen_Month_Box.getItemCount()-1);
                month_budget=(Integer)Chosen_Month_Box.getSelectedItem();
            }
            Chosen_Month_Box.setSelectedItem(month_budget);
        }catch(Exception e){System.out.println(e.getMessage());};
    }
    
    private void Chosen_Year_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Chosen_Year_BoxPopupMenuWillBecomeInvisible
        year_budget=(Integer)Chosen_Year_Box.getSelectedItem();
        Load_Budget();
    }//GEN-LAST:event_Chosen_Year_BoxPopupMenuWillBecomeInvisible

    private void Chosen_Month_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Chosen_Month_BoxPopupMenuWillBecomeInvisible
        month_budget=(Integer)Chosen_Month_Box.getSelectedItem();
        Load_Budget();
    }//GEN-LAST:event_Chosen_Month_BoxPopupMenuWillBecomeInvisible
    
    private void Load_Budget(){
        int income=0;
        int outcome=0;
        try{
            String query = "select salaries_sum,medicine_costs,hospital_costs from outcome where year='"+year_budget+"' AND month='"+month_budget+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Workers_Salary.setText(rs.getString("salaries_sum")+"€");
                Medicine_Costs.setText(rs.getString("medicine_costs")+"€");
                Hospital_Costs.setText(rs.getString("hospital_costs")+"€");
                outcome+=rs.getInt("salaries_sum")+rs.getInt("medicine_costs")+rs.getInt("hospital_costs");
            }
            rs.close();
            stmt.close();
            query = "select patients_income,medicine_income from income where year='"+year_budget+"' AND month='"+month_budget+"'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            while(rs.next()){
                Patients_Income.setText(rs.getString("patients_income")+"€");
                Medicines_Income.setText(rs.getString("medicine_income")+"€");
                income+=rs.getInt("patients_income")+rs.getInt("medicine_income");
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        Income_Total.setText(income+"€");
        Outcome_Total.setText(outcome+"€");
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel4">
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel5">
    private void Load_Incoming_Messages(){
        ArrayList messages = new ArrayList();
        messages.clear();
        try{
            String query = "select* from messages where owner='"+user+"' and receiver='"+user+"' order by date_time DESC";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                messages.add(rs.getString("date_time")+" | Από: "+rs.getString("sender")+" | "+rs.getString("message"));
            }
            rs.close();
            stmt.close();
        }catch(Exception e){};
        Incoming_List.setModel(new DefaultComboBoxModel(messages.toArray()));
    }
    
    private void Load_Outgoing_Messages(){
        ArrayList messages = new ArrayList();
        messages.clear();
        try{
            String query = "select* from messages where owner='"+user+"' and sender='"+user+"' order by date_time DESC";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                messages.add(rs.getString("date_time")+" | Προς: "+rs.getString("receiver")+" | "+rs.getString("message"));
            }
            rs.close();
            stmt.close();
        }catch(Exception e){};
        Outgoing_List.setModel(new DefaultComboBoxModel(messages.toArray()));
    }
    
    private void Load_Rec_Type_List(){
        ArrayList jobs = new ArrayList();
        jobs.add(null);
        jobs.add("Γιατρός");
        jobs.add("Νοσηλευτής");
        jobs.add("Γραμματέας");
        jobs.add("Αποθηκάριος");
        jobs.add("Διευθυντής");
        Rec_Type_Box.setModel(new DefaultComboBoxModel(jobs.toArray()));
    }
    
    private void Load_Rec_Name_Box(String job){
        ArrayList names = new ArrayList();
        names.add(null);
        try{
            String query = "select username,name,lastname from users where job='"+job+"' and username!='"+user+"' order by name ASC";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                names.add(rs.getString("name")+" "+rs.getString("lastname")+" | "+rs.getString("username"));
            }
            rs.close();
            stmt.close();
        }catch(Exception e){};
        Rec_Name_Box.setModel(new DefaultComboBoxModel(names.toArray()));
    }
    
    private void Load_Message_Expanded(String temp){
        String[] message=temp.split(" \\| |: ");
        Message_Expanded_DateTime.setText(message[0]);
        Message_Expanded_SR.setText(message[2]);
        Message_Expanded_Text.setText(message[3]);
    }
    
    private void Return_Button_Message_ExpandedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_Button_Message_ExpandedActionPerformed
        CardLayout card = (CardLayout)Panel5.getLayout();
        card.show(Panel5, "Main_Messages");
    }//GEN-LAST:event_Return_Button_Message_ExpandedActionPerformed

    private void Incoming_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Incoming_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2 && Incoming_List.getSelectedIndex() != -1) {
            CardLayout card = (CardLayout)Panel5.getLayout();
            card.show(Panel5, "Message_Expanded");
            Message_Expanded_SR_Label.setText("ΑΠΟΣΤΟΛΕΑΣ");
            String temp=Incoming_List.getSelectedValue();
            Load_Message_Expanded(temp);
            
        }
    }//GEN-LAST:event_Incoming_ListMouseReleased

    private void Outgoing_ListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Outgoing_ListMouseReleased
        if(evt.getButton() == evt.BUTTON1 && evt.getClickCount() == 2 && Outgoing_List.getSelectedIndex() != -1) {
            CardLayout card = (CardLayout)Panel5.getLayout();
            card.show(Panel5, "Message_Expanded");
            Message_Expanded_SR_Label.setText("ΠΑΡΑΛΗΠΤΗΣ");
            String temp=Outgoing_List.getSelectedValue();
            Load_Message_Expanded(temp);
        }
    }//GEN-LAST:event_Outgoing_ListMouseReleased

    private void Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_ButtonActionPerformed
        CardLayout card = (CardLayout)Panel5.getLayout();
        card.show(Panel5, "Main_Messages");
    }//GEN-LAST:event_Cancel_ButtonActionPerformed

    private void New_Message_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_Message_ButtonActionPerformed
        Load_Rec_Type_List();
        Rec_Name_Box.setEnabled(false);
        Send_Button.setEnabled(false);
        Rec_Name_Box.setSelectedItem(null);
        Message_Text.setText(null);
        CardLayout card = (CardLayout)Panel5.getLayout();
        card.show(Panel5, "New_Message");
    }//GEN-LAST:event_New_Message_ButtonActionPerformed

    private void Rec_Type_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Rec_Type_BoxPopupMenuWillBecomeInvisible
        Send_Button.setEnabled(false);
        Message_Text.setEnabled(false);
        Message_Text.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
        Message_Text.setText("");
        if(Rec_Type_Box.getSelectedItem() == null) {
            Rec_Name_Box.setEnabled(false);
            Rec_Name_Box.setSelectedItem(null);
        }
        else {
            Rec_Name_Box.setEnabled(true);
            Load_Rec_Name_Box(String.valueOf(Rec_Type_Box.getSelectedItem()));
        }
    }//GEN-LAST:event_Rec_Type_BoxPopupMenuWillBecomeInvisible

    private void Message_TextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Message_TextKeyReleased
        if(Message_Text.getText().equals("")) Send_Button.setEnabled(false);
        else Send_Button.setEnabled(true);
    }//GEN-LAST:event_Message_TextKeyReleased

    private void Send_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Send_ButtonActionPerformed
        try{  //insert stoixeia
            String query = "insert into messages (sender,receiver,owner,message) values (?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,user);
            pstmt.setString(2,chosen_receiver);
            pstmt.setString(3,user);
            pstmt.setString(4,Message_Text.getText());
            pstmt.executeUpdate();
            pstmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        try{  //insert stoixeia
            String query = "insert into messages (sender,receiver,owner,message) values (?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,user);
            pstmt.setString(2,chosen_receiver);
            pstmt.setString(3,chosen_receiver);
            pstmt.setString(4,Message_Text.getText());
            pstmt.executeUpdate();
            pstmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        CardLayout card = (CardLayout)Panel5.getLayout();
        card.show(Panel5, "Main_Messages");
        Load_Incoming_Messages();
        Load_Outgoing_Messages();
    }//GEN-LAST:event_Send_ButtonActionPerformed

    private void Rec_Name_BoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Rec_Name_BoxPopupMenuWillBecomeInvisible
        Send_Button.setEnabled(false);
        Message_Text.setText("");
        if(Rec_Name_Box.getSelectedItem() == null) {
            Message_Text.setEnabled(false);
            Message_Text.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
        }
        else {
            String temp=String.valueOf(Rec_Name_Box.getSelectedItem());
            String[] receiver=temp.split(" \\| ");
            chosen_receiver=receiver[1];
            Message_Text.setEnabled(true);
            Message_Text.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.background"));
        }
    }//GEN-LAST:event_Rec_Name_BoxPopupMenuWillBecomeInvisible

    private void Refresh_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh_ButtonActionPerformed
        Load_Incoming_Messages();
        Load_Outgoing_Messages();
    }//GEN-LAST:event_Refresh_ButtonActionPerformed

    private void Message_Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Message_Delete_ButtonActionPerformed
        try{  //insert stoixeia
            String query = "delete from messages where owner='"+user+"' and date_time='"+Message_Expanded_DateTime.getText()+"'";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
            pstmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
        CardLayout card = (CardLayout)Panel5.getLayout();
        card.show(Panel5, "Main_Messages");
        Load_Incoming_Messages();
        Load_Outgoing_Messages();
    }//GEN-LAST:event_Message_Delete_ButtonActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Panel6">
    private void Load_Account(){
        try{
            String query = "select* from users where username='"+user+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Username.setText(rs.getString("username"));
                Password.setText(rs.getString("password"));
                Email.setText(rs.getString("email"));
                Name.setText(rs.getString("name"));
                LastName.setText(rs.getString("lastname"));
                Birth_Date.setText(rs.getString("birth_date"));
                Tel_0.setText(rs.getString("tel_0"));
                Tel_1.setText(rs.getString("tel_1"));
                Adress.setText(rs.getString("address"));
                Start_Date.setText(rs.getString("start_date"));
            }
            rs.close();
            stmt.close();
        }catch(Exception e){System.out.println(e.getMessage());};
    }

    private void Account_Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Account_Update_ButtonActionPerformed
        try{
            String query = "update users set username=?,password=?,email=?,tel_0=?,tel_1=?,address=? where username='"+user+"'";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,Username.getText());
            pstmt.setString(2,Password.getText());
            pstmt.setString(3,Email.getText());
            pstmt.setString(4,Tel_0.getText());
            pstmt.setString(5,Tel_1.getText());
            pstmt.setString(6,Adress.getText());
            pstmt.executeUpdate();
            pstmt.close();
            user=Username.getText();
            this.setTitle("MedX - Καλώς ήρθες διευθυντή - "+user);
        }catch(Exception e){System.out.println(e.getMessage());};
        Load_Account();
    }//GEN-LAST:event_Account_Update_ButtonActionPerformed
    // </editor-fold>
    
}