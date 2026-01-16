import com.mirkamol.exercise.*;

void main() {
    Address address = new Address(
            "Alisher Navoiy street",
            "Amir Temur street",
            10000,
            "Uzbekistan");

    House house = new House(
            HouseType.DETACHED,
            2,
            8,
            true,
            address
    );

    Car chevrolet = new Car(
            CarBrand.CHEVROLET,
            "Gentra",
            LocalDate.of(2025,12,12));

    Person person = new Person(
            "Shojahon",
            "Akbarov",
            address,
            chevrolet,
            house
    );

    System.out.println(person);
}