package jornadadeaprendizagem.renault.models.dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import jornadadeaprendizagem.renault.models.entities.Action
import java.util.*

@ApiModel(
        value = "ActionDTO",
        description = "Response Data Transfer Object for Action"
)
data class ActionDTO (
        @ApiModelProperty(value = "Action id")
        @JsonProperty("id")
        val id : UUID,

        @ApiModelProperty(value = "Action estrategy")
        @JsonProperty("estrategy")
        val estrategy : String,

        @ApiModelProperty(value = "Action desc_action")
        @JsonProperty("desc_action")
        val desc_action : String,

        @ApiModelProperty(value = "Action ini_plain_action")
        @JsonProperty("ini_plain_action")
        val ini_plain_action : Date,

        @ApiModelProperty(value = "Action date_alert")
        @JsonProperty("date_alet")
        val date_alert : Date,

        @ApiModelProperty(value = "Action time_resolution")
        @JsonProperty("time_resolution")
        val time_resolution : Float,

        @ApiModelProperty(value = "Action commentary")
        @JsonProperty("commentary")
        val commentary : String,

        @ApiModelProperty(value = "Action capitalization")
        @JsonProperty("capitalization")
        val capitalization : String,
) {

    constructor(action: Action) : this(
            id = action.id,
            estrategy = action.estrategy,
            desc_action = action.desc_action,
            ini_plain_action = action.ini_plain_action,
            date_alert = action.date_alert,
            time_resolution = action.time_resolution,
            commentary = action.commentary,
            capitalization = action.capitalization
    )
}