package schematics.schematics_server.beamlineschematics;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicElementEntity;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicMachineEntity;
import schematics.schematics_server.beamlineschematics.model.BeamlineSchematicPositionEntity;
import schematics.schematics_server.beamlineschematics.repository.BeamlineSchematicElementEntityRepository;
import schematics.schematics_server.beamlineschematics.repository.BeamlineSchematicMachineEntityRepository;
import schematics.schematics_server.beamlineschematics.repository.BeamlineSchematicPositionEntityRepository;

import java.time.Instant;

@Component
public class SeedDB {
    private final BeamlineSchematicElementEntityRepository beamlineSchematicElementEntityRepository;
    public BeamlineSchematicMachineEntityRepository beamlineSchematicMachineEntityRepository;
    public BeamlineSchematicPositionEntityRepository beamlineSchematicPositionEntityRepository;

    public SeedDB(BeamlineSchematicMachineEntityRepository beamlineSchematicMachineEntityRepository, BeamlineSchematicPositionEntityRepository beamlineSchematicPositionEntityRepository, BeamlineSchematicElementEntityRepository beamlineSchematicElementEntityRepository) {
        this.beamlineSchematicMachineEntityRepository = beamlineSchematicMachineEntityRepository;
        this.beamlineSchematicPositionEntityRepository= beamlineSchematicPositionEntityRepository;
        this.beamlineSchematicElementEntityRepository = beamlineSchematicElementEntityRepository;
    }

    @PostConstruct
    public void init(){

/*
      BeamlineSchematicMachineEntity machine = new BeamlineSchematicMachineEntity(
                2036829L,
                4805738L,
                "F61",
                "F61 Transfer Line",
                Instant.parse("2007-10-08T00:00:00Z"),
                Instant.parse("4000-01-01T00:00:00Z"),
                33.762,
                true
        );
        beamlineSchematicMachineEntityRepository.save(machine);

        BeamlineSchematicMachineEntity machine1 = new BeamlineSchematicMachineEntity(
                2180065L,
                4805741L,
                "SPS",
                "SPS Ring",
                Instant.parse("2008-02-18T00:00:00Z"),
                Instant.parse("4000-01-01T00:00:00Z"),
                6911.5038,
                true
        );
        beamlineSchematicMachineEntityRepository.save(machine1);


        BeamlineSchematicPositionEntity position1 = new BeamlineSchematicPositionEntity(
                53000352L,
                "F61.MQNEF021",
                4805738L,
                0.15671,
                0.89721,
                21.63771,
                Instant.parse("2021-05-10T00:00:00Z"),
                Instant.parse("4000-01-01T00:00:00Z")
        );
        beamlineSchematicPositionEntityRepository.save(position1);

        BeamlineSchematicPositionEntity position2 = new BeamlineSchematicPositionEntity(
                53000546L,
                "F61.BCTFV022",
                4805738L,
                22.00121,
                22.14971,
                22.29821,
                Instant.parse("2021-05-10T00:00:00Z"),
                Instant.parse("4000-01-01T00:00:00Z")
        );
        beamlineSchematicPositionEntityRepository.save(position2);

        BeamlineSchematicPositionEntity position3 = new BeamlineSchematicPositionEntity(
                57951786L,
                "F61.XVC016",
                4805738L,
                15.27921,
                15.59896,
                15.91871,
                Instant.parse("2021-05-10T00:00:00Z"),
                Instant.parse("4000-01-01T00:00:00Z")
        );
        beamlineSchematicPositionEntityRepository.save(position3);

        BeamlineSchematicPositionEntity position4 = new BeamlineSchematicPositionEntity(
                53123049L,
                "F61.XSEC023",
                4805738L,
                22.61221,
                22.73221,
                22.85221,
                Instant.parse("2021-05-10T00:00:00Z"),
                Instant.parse("4000-01-01T00:00:00Z")
        );
        beamlineSchematicPositionEntityRepository.save(position4);

        BeamlineSchematicPositionEntity position5 = new BeamlineSchematicPositionEntity(
                57952013L,
                "F61.XVC030",
                4805738L,
                29.34221,
                29.94121,
                30.54021,
                Instant.parse("2021-05-10T00:00:00Z"),
                Instant.parse("4000-01-01T00:00:00Z")
        );
        beamlineSchematicPositionEntityRepository.save(position5);

        BeamlineSchematicPositionEntity position6 = new BeamlineSchematicPositionEntity(
                57951980L,
                "F61.XVB030",
                4805738L,
                29.24021,
                29.29021,
                29.34021,
                Instant.parse("2021-05-10T00:00:00Z"),
                Instant.parse("4000-01-01T00:00:00Z")
        );
        beamlineSchematicPositionEntityRepository.save(position6);

        BeamlineSchematicPositionEntity position7 = new BeamlineSchematicPositionEntity(
                57951693L,
                "F61.XVB013",
                4805738L,
                12.80921,
                12.87571,
                12.94221,
                Instant.parse("2021-05-10T00:00:00Z"),
                Instant.parse("4000-01-01T00:00:00Z")
        );
        beamlineSchematicPositionEntityRepository.save(position7);



        BeamlineSchematicElementEntity element2 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                1,
                "test",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#FF4500",
                "test",
                1.481,
                0.8775,
                0.844,
                21.63771,
                0.0,
                0.0,
                20.89721,
                0.0,
                0.0,
                20.15671,
                0.0,
                0.0,
                "F61"
        );

        beamlineSchematicElementEntityRepository.save(element2);

        BeamlineSchematicElementEntity element3 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                2,
                "test1",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#FF4500",
                "test",
                0.302,
                0.139,
                0.139,
                21.47596,
                0.0,
                0.0,
                21.32496,
                0.0,
                0.0,
                21.17396,
                0.0,
                0.0,
                "F61 VAC"
        );

        beamlineSchematicElementEntityRepository.save(element3);

        BeamlineSchematicElementEntity element4 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                1,
                "test",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#FF4500",
                "test",
                1.358,
                1.04,
                0.508,
                14.62721,
                0.0,
                0.0,
                13.94821,
                0.0,
                0.0,
                13.26921,
                0.0,
                0.0,
                "F61"
        );

        beamlineSchematicElementEntityRepository.save(element4);

        BeamlineSchematicElementEntity element5 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                3,
                "test1",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#FF4500",
                "test",
                0.6494,
                1.5,
                0.51,
                19.92661,
                0.0,
                0.0,
                19.60191,
                0.0,
                0.0,
                19.27721,
                0.0,
                0.0,
                "F61"
        );

        beamlineSchematicElementEntityRepository.save(element5);

        BeamlineSchematicElementEntity element6 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                1,
                "test",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#FF4500",
                "test",
                0.6494,
                1.5,
                0.51,
                18.92661,
                0.0,
                0.0,
                19.60191,
                0.0,
                0.0,
                18.27721,
                0.0,
                0.0,
                "F61"
        );

        beamlineSchematicElementEntityRepository.save(element6);

        BeamlineSchematicElementEntity element7 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                3,
                "test1",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#006400",
                "test",
                0.133,
                0.159,
                0.159,
                19.57196,
                0.0,
                0.0,
                19.50546,
                0.0,
                0.0,
                19.43896,
                0.0,
                0.0,
                "F61 VAC"
        );

        beamlineSchematicElementEntityRepository.save(element7);

        BeamlineSchematicElementEntity element8 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                1,
                "test1",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#4169E1",
                "test",
                0.24,
                0.33,
                0.24,
                22.85221,
                0.0,
                0.0,
                22.73221,
                0.0,
                0.0,
                22.61221,
                0.0,
                0.0,
                "F61"
        );

        beamlineSchematicElementEntityRepository.save(element8);

        BeamlineSchematicElementEntity element9 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                1,
                "test",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#4169E1",
                "test",
                0.297,
                0.242,
                0.234,
                22.29821,
                0.0,
                0.0,
                22.14971,
                0.0,
                0.0,
                22.00121,
                0.0,
                0.0,
                "F61"
        );

        beamlineSchematicElementEntityRepository.save(element9);

        BeamlineSchematicElementEntity element10 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                1,
                "test2",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#FF4500",
                "test",
                0.495,
                0.87,
                0.953,
                12.96071,
                0.0,
                0.0,
                12.71321,
                0.0,
                0.0,
                12.46571,
                0.0,
                0.0,
                "F61"
        );

        beamlineSchematicElementEntityRepository.save(element10);

        BeamlineSchematicElementEntity element11 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                1,
                "test",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#666699",
                "test",
                0.6494,
                1.5,
                0.51,
                16.85821,
                0.0,
                0.0,
                16.53351,
                0.0,
                0.0,
                16.20881,
                0.0,
                0.0,
                "F61"
        );

        beamlineSchematicElementEntityRepository.save(element11);

        BeamlineSchematicElementEntity element12 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                3,
                "test",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#006400",
                "test",
                0.133,
                0.159,
                0.159,
                14.67721,
                0.0,
                0.0,
                14.61071,
                0.0,
                0.0,
                14.54421,
                0.0,
                0.0,
                "F61 VAC"
        );

        beamlineSchematicElementEntityRepository.save(element12);

        BeamlineSchematicElementEntity element13 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                1,
                "test2",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#006400",
                "test",
                0.107,
                0.159,
                0.102,
                26.13631,
                0.0,
                0.0,
                26.08281,
                0.0,
                0.0,
                26.02931,
                0.0,
                0.0,
                "F61,F61 VAC"
        );

        beamlineSchematicElementEntityRepository.save(element13);

        BeamlineSchematicElementEntity element14 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                1,
                "test",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#2AB32A",
                "test",
                0.0,
                1.1,
                0.4,
                28.0,
                0.0,
                0.0,
                28.0,
                0.0,
                0.0,
                28.0,
                0.0,
                0.0,
                "F61 VAC"
        );

        beamlineSchematicElementEntityRepository.save(element14);

        BeamlineSchematicElementEntity element15 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                1,
                "test2",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#006400",
                "test",
                0.1,
                0.159,
                0.159,
                29.34021,
                0.0,
                0.0,
                29.29021,
                0.0,
                0.0,
                29.24021,
                0.0,
                0.0,
                "F61 VAC"
        );

        beamlineSchematicElementEntityRepository.save(element15);

        BeamlineSchematicElementEntity element16 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                2,
                "test",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#006400",
                "test",
                0.1,
                0.159,
                0.159,
                2.34021,
                0.0,
                0.0,
                2.29021,
                0.0,
                0.0,
                2.24021,
                0.0,
                0.0,
                "F61 VAC"
        );

        beamlineSchematicElementEntityRepository.save(element16);

        BeamlineSchematicElementEntity element17 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                1,
                "test",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#006400",
                "test",
                0.1,
                0.159,
                0.159,
                4.34021,
                0.0,
                0.0,
                4.29021,
                0.0,
                0.0,
                4.24021,
                0.0,
                0.0,
                "F61 VAC"
        );

        beamlineSchematicElementEntityRepository.save(element17);

        BeamlineSchematicElementEntity element18 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                1,
                "test",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#006400",
                "test",
                0.1,
                0.159,
                0.159,
                6.34021,
                0.0,
                0.0,
                6.29021,
                0.0,
                0.0,
                6.24021,
                0.0,
                0.0,
                "F61 VAC"
        );

        beamlineSchematicElementEntityRepository.save(element18);

        BeamlineSchematicElementEntity element19 = new BeamlineSchematicElementEntity(
                2036829L,
                4805738L,
                "test",
                "test",
                "test",
                1,
                "test",
                Instant.parse("2022-12-31T23:59:59.00Z"),
                1,
                Instant.parse("2027-12-31T23:59:59.00Z"),
                "test",
                1,
                2036829L,
                "test",
                "#FF4500",
                "test",
                0.6494,
                1.5,
                0.51,
                2.92661,
                0.0,
                0.0,
                2.60191,
                0.0,
                0.0,
                2.27721,
                0.0,
                0.0,
                "F61"
        );

        beamlineSchematicElementEntityRepository.save(element19);*/
    }
}