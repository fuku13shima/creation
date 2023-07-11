package action;
/*使用するほかのjavaファイルのパスを設定
 * 設定するパスの基準は
*/
import java.util.ArrayList;

import dao.CustomerSearchDBAccess;
import model.Customer;
import model.OrderControlUtility;

public class CustomerSearchAction extends Object {
    public String[][] execute(String[] data) throws Exception {
         // 半角スペースと全角スペースを取り除く
        CustomerSearchDBAccess SCDBA = new CustomerSearchDBAccess();
        String tel = data[0].replaceAll("[\\s　]", "");
        String kana = data[1].replaceAll("[\\s　]", "");

        ArrayList<Customer> customerList = null;

        try {
            if (!tel.equals("") && kana.equals("")) {
                // data[0]に一致する顧客情報リストを問い合わせる
                customerList = SCDBA.searchCustomerByTel(tel);
                
            } else if (tel.equals("") && !kana.equals("")) {
                // data[1]を含む顧客情報リストを問い合わせる
                customerList = SCDBA.searchCustomerByKana(kana);
            } else if (!tel.equals("") && !kana.equals("")) {
                // data[0]に一致し、data[1]を含む顧客情報リストを問い合わせる
                customerList = SCDBA.searchCustomer(tel, kana);
                
            }

            if (customerList != null && customerList.size() == 1) {

                // customerToArrayメソッドを呼び出す
                String[][] tableData = OrderControlUtility.customerToArray(customerList);
                
                // 結果を利用するなどの処理を行う
                // 検索結果表示用データに変換する
                //String[][] tableData = new String[1][2];
                //tableData[0][0] = customerList.get(0).getTel();
                //tableData[0][1] = customerList.get(0).getKana();
                return tableData;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}