package jornadadeaprendizagem.renault.models.dtos.residual

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import jornadadeaprendizagem.renault.models.entities.Residual

import org.springframework.format.annotation.DateTimeFormat
import java.util.*

@ApiModel(
        value = "ResponseResidualDTO",
        description = "Response Data Transfer Object for Action"
)
data class ResponseResidualDTO (
        @JsonProperty("id")
        val id : UUID,

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
        val status_RR : String
) {
    constructor(residual: Residual) : this(
            id = UUID.randomUUID(),
            probability_RR = residual.probability_RR,
            impact_RR = residual.impact_RR,
            classification_RR = residual.classification_RR,
            action_RR = residual.action_RR,
            risk_RR = residual.risk_RR,
            date_Resolution = residual.date_Resolution,
            status_RR = residual.status_RR
    )
}