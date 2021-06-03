package metaDataBillPay;
import javax.swing.JOptionPane;

public class Business_Layer {
	
		// Main method to test functionality 
		public static void main(String[] args) {
			
			GetLoginInfo();
		}
		
        public static Boolean GetLoginInfo()
        {
            // Get login info 
            String username = "ChrisIPoulin";
            String password = "15889_";

            Database_SQLQueries db = new Database_SQLQueries();
            try
            {
                // Use DB login confirmation method to see if login was successful or not
                Boolean result = db.LoginConfirmation(username, password);
                if (result == true)
                {
                	JOptionPane.showMessageDialog(null, "Login Successful.");
                    return true;
                }
                else
                {
                	JOptionPane.showMessageDialog(null, "Invalid username and password combination. Please try again.");
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
