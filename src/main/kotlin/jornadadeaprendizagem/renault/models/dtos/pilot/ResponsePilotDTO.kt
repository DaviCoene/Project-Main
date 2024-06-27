package models.dtos.pilot

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import models.entities.Pilot
import java.util.*

@ApiModel(
        value = "ResponsePilotDTO",
        description = "Response Data Transfer Object for Pilot"
)
data class ResponsePilotDTO (
        @ApiModelProperty(value = "Pilot id")
        @JsonProperty("id")
        val id : UUID,

        @ApiModelProperty(value = "Pilot name")
        @JsonProperty("name")
        val name : String
) {

    constructor(pilot: models.entities.Pilot) : this(
            id = pilot.id,
            name = pilot.name
    )
}