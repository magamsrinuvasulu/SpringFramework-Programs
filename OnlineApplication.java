package spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class OnlineApplication {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("eCommerce.xml");
        User user = context.getBean("user", User.class);
        Product product = context.getBean("product", Product.class);
        Orders orders = context.getBean("orders", Orders.class);
        DeilveryBoy delivery = context.getBean("delivery", DeilveryBoy.class);
        System.out.println("User Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Phone: " + user.getPhoneNumber());
        System.out.println("Product: " + product.getProductName());
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Number of Orders: " + orders.getNumberOfOrders());
        System.out.println("Amount: " + orders.getAmount());
        System.out.println("Returns: " + delivery.isReturns());
    }
}