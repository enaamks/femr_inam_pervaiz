package femr.business.services.system;

import femr.common.dtos.ServiceResponse;
import femr.common.models.ResearchResultSetItem;

public class ResearchServiceRefactor {
    private final ServiceResponse<ResearchResultSetItem> value;

    public ResearchServiceRefactor(ServiceResponse<ResearchResultSetItem> value) {
        this.value = value;
    }

    public ServiceResponse<ResearchResultSetItem> getValue() {
        return value;
    }
}
