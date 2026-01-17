import com.mirkamol.exercises.email.EmailValidator;
import com.mirkamol.exercises.enums.TShirtSize;

void main() {
    TShirtSize[] sizes = TShirtSize.values();

    for (TShirtSize size : sizes) {
        String lowercaseName = size.name().toLowerCase();
        System.out.println("Lowercased T Shirt Size: " + lowercaseName);
    }

    EmailValidator emailValidator = new EmailValidator();
    System.out.println(emailValidator.validateEmail("s@gmail.com"));
}