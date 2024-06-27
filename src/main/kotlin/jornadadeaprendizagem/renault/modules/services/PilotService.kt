package jornadadeaprendizagem.renault.modules.services

import models.dtos.pilot.RequestPilotDTO
import models.dtos.pilot.ResponsePilotDTO
import models.entities.Pilot
import jornadadeaprendizagem.renault.modules.providers.PilotProvider
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class PilotService (private val pilotProvider: PilotProvider) {

    fun create(requestPilotDTO: models.dtos.pilot.RequestPilotDTO): models.dtos.pilot.ResponsePilotDTO =
        models.dtos.pilot.ResponsePilotDTO(pilotProvider.create(models.entities.Pilot((requestPilotDTO))))

    //read
    fun findAll(): List<models.dtos.pilot.ResponsePilotDTO> = pilotProvider.findAll().map {
        models.dtos.pilot.ResponsePilotDTO(
            it
        )
    }

    //read
    fun findById(id: UUID): models.dtos.pilot.ResponsePilotDTO =
        models.dtos.pilot.ResponsePilotDTO(pilotProvider.findById(id))

    fun update(id: UUID, requestPilotDTO: models.dtos.pilot.RequestPilotDTO): models.dtos.pilot.ResponsePilotDTO =
        models.dtos.pilot.ResponsePilotDTO(pilotProvider.update(id, models.entities.Pilot(requestPilotDTO)))

    fun delete(id: UUID) = pilotProvider.delete(id)
}