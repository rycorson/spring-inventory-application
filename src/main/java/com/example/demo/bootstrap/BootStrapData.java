package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        if (partRepository.count()==0){
            InhousePart deck = new InhousePart();
            deck.setName("8.25\" Deck");
            deck.setPrice(60.00);
            deck.setInv(20);
            deck.setPartId(1);
            deck.setMinInv(1);
            deck.setMaxInv(100);

            InhousePart truck = new InhousePart();
            truck.setName("149mm Truck, Set of 2");
            truck.setPrice(60.00);
            truck.setInv(20);
            truck.setPartId(2);
            truck.setMinInv(1);
            truck.setMaxInv(100);

            InhousePart gripTape = new InhousePart();
            gripTape.setName("Grip Tape");
            gripTape.setPrice(10.00);
            gripTape.setInv(20);
            gripTape.setPartId(3);
            gripTape.setMinInv(1);
            gripTape.setMaxInv(100);

            InhousePart wheel = new InhousePart();
            wheel.setName("52mm Wheel, Set of 4");
            wheel.setPrice(20.00);
            wheel.setInv(20);
            wheel.setPartId(4);
            wheel.setMinInv(1);
            wheel.setMaxInv(100);

            InhousePart bearing = new InhousePart();
            bearing.setName("Ceramic Bearing, Set of 8");
            bearing.setPrice(40.00);
            bearing.setInv(20);
            bearing.setPartId(5);
            bearing.setMinInv(1);
            bearing.setMaxInv(100);

            partRepository.save(deck);
            partRepository.save(truck);
            partRepository.save(gripTape);
            partRepository.save(wheel);
            partRepository.save(bearing);
        }

        if (productRepository.count()==0){
            Product completeBoard = new Product("Complete Skateboard", 190.00, 5);
            Product deckAndTape = new Product("8.25\" Deck and Grip Tape", 70.00, 5);
            Product truckSet = new Product("8.25\" Deck, Grip Tape, and Two 149mm Trucks", 130.00, 5);
            Product wheelSet = new Product("Four 52mm Wheels and Bearings", 60.00, 5);
            Product trucksAndWheels = new Product("Two 149mm Trucks and Four 52mm Wheels with Bearings", 120.00, 5);

            productRepository.save(completeBoard);
            productRepository.save(deckAndTape);
            productRepository.save(truckSet);
            productRepository.save(wheelSet);
            productRepository.save(trucksAndWheels);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
