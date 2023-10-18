package digit.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import org.egov.common.contract.response.ResponseInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;

/**
 * BoundaryRelationshipResponse
 */
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2023-10-16T17:02:11.361704+05:30[Asia/Kolkata]")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoundaryRelationshipResponse   {
        @JsonProperty("ResponseInfo")

          @Valid
                private ResponseInfo responseInfo = null;

        @JsonProperty("TenantBoundary")
          @Valid
                private List<BoundaryRelation> tenantBoundary = null;


        public BoundaryRelationshipResponse addTenantBoundaryItem(BoundaryRelation tenantBoundaryItem) {
            if (this.tenantBoundary == null) {
            this.tenantBoundary = new ArrayList<>();
            }
        this.tenantBoundary.add(tenantBoundaryItem);
        return this;
        }

}
