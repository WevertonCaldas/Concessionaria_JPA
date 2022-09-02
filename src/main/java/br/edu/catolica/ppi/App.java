package br.edu.catolica.ppi;

import br.edu.catolica.ppi.dao.AccessoryDAO;
import br.edu.catolica.ppi.dao.CarStoreDAO;
import br.edu.catolica.ppi.dao.OwnerDAO;
import br.edu.catolica.ppi.dao.VehicleDAO;
import br.edu.catolica.ppi.domain.*;

import java.util.List;

public class App {
    public static void main(String[] args) {

        var accessoryDAO = new AccessoryDAO();

        var vehicleDAO = new VehicleDAO();

        var ownerDAO = new OwnerDAO();

        var carStoreDAO = new CarStoreDAO();

        var accessory = Accessory.builder().name("GPS").price(2000.0).build();



        //var accessoryList = List.of(
         //       Accessory.builder().name("Multimedia").price(1000.0).build(),
         //       Accessory.builder().name("Conditional Air").price(2500.).build()
       // );


        var conditionalAir = accessoryDAO.findById(Accessory.class, 3l);
        var multimedia = accessoryDAO.findById(Accessory.class, 2l);

        var fordMustang = Vehicle.builder().mark("Ford").model("Mustang").value(1500000.0).year(2020).accessories(List.of(
                conditionalAir, multimedia
        )).build();

        var ferrari = Vehicle.builder()
                .mark("Ferrari")
                .model("Ferrari F140")
                .value(25000000.0)
                .year(2022)
                .accessories(List.of(conditionalAir))
                .build();

        var bmw = Vehicle.builder()
                .mark("BMW")
                .model("X5")
                .value(2000000.0)
                .year(2020)
                .accessories(List.of(multimedia))
                .build();



        fordMustang = vehicleDAO.findById(Vehicle.class, 1l);

        var carStore = CarStore.builder()
                .address(Address.builder().city("Barro")
                        .district("Zona Rural")
                        .number("03")
                        .street("Distrito de Engenho Velho")
                        .build())
                .contact(Contact.builder()
                        .email("weverton@gmail.com")
                        .phoneNumber("35698658")
                        .build())
                .name("Super Car")
                .cnpj("1234567")
                .vehicles(List.of(fordMustang))
                .build();

        carStore = carStoreDAO.findById(CarStore.class, 2l);

        bmw = vehicleDAO.findById(Vehicle.class, 3l);
        ferrari = vehicleDAO.findById(Vehicle.class, 2l);

        //carStore.setVehicles(List.of(ferrari, bmw));
        //carStore.getVehicles().add(fordMustang);

        //ferrari.setOwner(carStore);
        //fordMustang.setOwner(carStore);
        //bmw.setOwner(carStore);

        //Cadastrando e vendendo um veiculo ao cliente

/*
        var customer = Customer.builder()
                .cpf("12376212")
                .name("Jose da Silva")
                .contact(Contact.builder()
                        .phoneNumber("88999544967")
                        .email("jose@gmail.com")
                        .build())
                .address(Address.builder()
                        .street("Av Principal")
                        .number("13")
                        .district("Bairro da pedra")
                        .city("Barro")
                        .build())
                        .build();

        var jose = (Customer) ownerDAO.findById(Owner.class, 3l);

*/

        //carStore.getCustomers().
        //

        //jose.setVehicles(List.of(bmw));


        //System.out.println("Salvando acessório na base de dados...");

        vehicleDAO.saveOrUpdate(fordMustang);

        //accessoryDAO.saveOrUpdate(accessory);

        //accessoryDAO.saveList(accessoryList);

        //ownerDAO.saveOrUpdate(carStore);

        vehicleDAO.saveList(List.of(ferrari, bmw, fordMustang));
        //carStoreDAO.saveOrUpdate(carStore);

        //ownerDAO.saveOrUpdate(customer);

        System.out.println("Operação realizada com sucesso!!!");

    }
}
