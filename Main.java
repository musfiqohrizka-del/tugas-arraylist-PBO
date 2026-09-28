import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("ARRAY");

        String[] city = {
            "Mataram",
            "Praya",
            "Sumbawa"
        };

        System.out.println("Kota pertama: " + city[0]);
        System.out.println("Jumlah kota: " + city.length);

        System.out.println("Daftar kota:");

        for (int i = 0; i < city.length; i++) {
            System.out.println(i + ": " + city[i]);
        }

        System.out.println();
        System.out.println("ARRAY UTILITY");

        int[] numbers = {5, 2, 8, 1};
        System.out.println("Array awal: " + Arrays.toString(numbers));
        Arrays.sort(numbers);

        System.out.println("Setelah sort: " + Arrays.toString(numbers));
        int[] copyNumbers = Arrays.copyOf(numbers, 6);

        System.out.println("Hasil copyOf: " + Arrays.toString(copyNumbers));
        Arrays.fill(numbers, 7);

        System.out.println("Setelah fill: " + Arrays.toString(numbers));

        System.out.println("Apakah array sama: " + Arrays.equals(numbers, copyNumbers));

        System.out.println();
        System.out.println("ARRAY 2 DIMENSI");

        String[][] data = {
            {
                "America",
                "England",
                "Japan",
                "France",
                "Indonesia",
                "Iran",
                "Iraq"
            },
            {
                "Washington",
                "London",
                "Tokyo",
                "Paris",
                "Jakarta",
                "Tehran",
                "Baghdad"
            }
        };

        for (int i = 0; i < data[0].length; i++) {
            System.out.println(
                "The capital of "
                + data[0][i]
                + " is "
                + data[1][i]
            );
        }

        System.out.println();
        System.out.println("ARRAYLIST");

        ArrayList<String> names = new ArrayList<String>();

        names.add("Musfi");
        names.add("Eka");
        System.out.println("Setelah add: " + names);
        names.add(1, "Yiyi");
        System.out.println("Setelah add index 1: " + names);

        names.remove(0);
        System.out.println("Setelah remove index 0: " + names);

        names.set(0, "Yola");
        System.out.println("Setelah set index 0: " + names);

        String name = names.get(0);
        System.out.println("Hasil get(0): " + name);
        System.out.println("Jumlah data: " + names.size());

        System.out.println();
        System.out.println("BANK ACCOUNT");

        ArrayList<Account> accounts = new ArrayList<Account>();

        accounts.add(new Account(100000));
        accounts.add(new Account(200000));
        accounts.add(new Account(300000));
        Account account = accounts.get(0);

        System.out.println("Saldo awal: " + account.getBalance());
        account.deposit(50000);

        System.out.println("Setelah deposit: " + account.getBalance());

        account.withdraw(25000);
        System.out.println("Setelah withdraw: " + account.getBalance());

        System.out.println("Jumlah account: " + accounts.size());

        System.out.println();
        System.out.println("CUSTOMER");

        Customer customer = new Customer("Liya", "Qom");
        customer.setAccount(new Account(500000));

        System.out.println("Nama customer: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("Jumlah account: " + customer.getNumOfAccounts());

        Account customerAccount =
                customer.getAccount(0);

        System.out.println("Saldo customer: " + customerAccount.getBalance());

        System.out.println();
        System.out.println("BANK");

        Bank bank = new Bank();

        bank.addCustomer("Musfiqoh", "Aulia");
        bank.addCustomer("Annisa", "Ahlak");
        bank.addCustomer("Yola", "Baiq");

        System.out.println(
            "Jumlah customer: "
            + bank.getNumOfCustomers()
        );

        Customer customer1 =
                bank.getCustomer(0);

        Customer customer2 =
                bank.getCustomer(1);

        System.out.println("Customer pertama: " + customer1.getFirstName() + " " + customer1.getLastName());
        System.out.println("Customer kedua: " + customer2.getFirstName() + " " + customer2.getLastName()
        );
    }
}