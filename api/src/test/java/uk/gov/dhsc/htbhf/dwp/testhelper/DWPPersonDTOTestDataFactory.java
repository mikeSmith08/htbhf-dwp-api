package uk.gov.dhsc.htbhf.dwp.testhelper;

import uk.gov.dhsc.htbhf.dwp.model.DWPPersonDTO;

import static uk.gov.dhsc.htbhf.dwp.testhelper.AddressDTOTestDataFactory.aValidAddress;
import static uk.gov.dhsc.htbhf.dwp.testhelper.TestConstants.HOMER_DOB;
import static uk.gov.dhsc.htbhf.dwp.testhelper.TestConstants.HOMER_FORENAME;
import static uk.gov.dhsc.htbhf.dwp.testhelper.TestConstants.HOMER_NINO;
import static uk.gov.dhsc.htbhf.dwp.testhelper.TestConstants.SIMPSON_SURNAME;

public class DWPPersonDTOTestDataFactory {

    public static DWPPersonDTO aValidDWPPerson() {
        return buildDefaultDWPPerson().build();
    }

    private static DWPPersonDTO.DWPPersonDTOBuilder buildDefaultDWPPerson() {
        return DWPPersonDTO.builder()
                .dateOfBirth(HOMER_DOB)
                .nino(HOMER_NINO)
                .address(aValidAddress())
                .forename(HOMER_FORENAME)
                .surname(SIMPSON_SURNAME);
    }
}