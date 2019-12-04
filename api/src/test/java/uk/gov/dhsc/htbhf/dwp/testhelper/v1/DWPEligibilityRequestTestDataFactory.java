package uk.gov.dhsc.htbhf.dwp.testhelper.v1;

import uk.gov.dhsc.htbhf.dwp.model.v1.DWPEligibilityRequest;

import static uk.gov.dhsc.htbhf.TestConstants.ELIGIBLE_END_DATE;
import static uk.gov.dhsc.htbhf.TestConstants.ELIGIBLE_START_DATE;
import static uk.gov.dhsc.htbhf.TestConstants.UC_MONTHLY_INCOME_THRESHOLD;
import static uk.gov.dhsc.htbhf.dwp.testhelper.v1.DWPPersonDTOTestDataFactory.aValidDWPPerson;


public class DWPEligibilityRequestTestDataFactory {

    public static DWPEligibilityRequest aValidDWPEligibilityRequest() {
        return aValidEligibilityRequestBuilder().build();
    }

    private static DWPEligibilityRequest.DWPEligibilityRequestBuilder aValidEligibilityRequestBuilder() {
        return DWPEligibilityRequest.builder()
                .person(aValidDWPPerson())
                .ucMonthlyIncomeThreshold(UC_MONTHLY_INCOME_THRESHOLD)
                .eligibleStartDate(ELIGIBLE_START_DATE)
                .eligibleEndDate(ELIGIBLE_END_DATE);
    }
}
