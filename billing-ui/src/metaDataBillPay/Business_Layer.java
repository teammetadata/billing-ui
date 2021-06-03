package metaDataBillPay;
import javax.swing.JOptionPane;

public class Business_Layer {
	
//		// Main method to test functionality 
//		public static void main(String[] args) {
//			
//			GetLoginInfo();
//		}
		
        public Boolean GetLoginInfo(String user, String pwd)
        {
            // Get login info 
            String username = user;
            String password = pwd;
            
            JOptionPane.showMessageDialog(null, user + " " + pwd.toString());
            Database_SQLQueries db = new Database_SQLQueries();
            try
            {
                // Use DB login confirmation method to see if login was successful or not
                Boolean result = db.LoginConfirmation(username, password);
                if (result == true)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            catch (Exception e) // Exception catching path
            {
            	JOptionPane.showMessageDialog(null, "ERROR#4 Unexpected error occured. Please contact your system "
            								  + "adminstration for addtional help at 1-800-123-4567.");
            }

            return false;

        }
        

}
