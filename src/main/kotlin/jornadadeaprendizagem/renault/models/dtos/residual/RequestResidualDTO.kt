package jornadadeaprendizagem.renault.models.dtos.residual

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import org.springframework.format.annotation.DateTimeFormat
import java.util.*

@ApiModel(
        value = "RequestResidualDTO",
        description = "Request Data Transfer Object for Residual"
)
data class RequestResidualDTO (
        @JsonProperty("Probability_RR")
        val probability_RR : String,

        @JsonProperty("Impact_RR")
        val impact_RR : String,

        @JsonProperty("Classification_RR")
        val classification_RR : String,

        @JsonProperty("Action_RR")
        val action_RR : String,

        @JsonProperty("Risk_RR")
        val risk_RR : String,

        @JsonProperty("Date_Resolution")
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        val date_Resolution : Date?,

        @JsonProperty("Status_RR")
        val status_RR : String)
