package jornadadeaprendizagem.renault.modules.services

import jornadadeaprendizagem.renault.models.entities.Residual
import jornadadeaprendizagem.renault.models.dtos.residual.RequestResidualDTO
import jornadadeaprendizagem.renault.models.dtos.residual.ResponseResidualDTO
import jornadadeaprendizagem.renault.modules.providers.ResidualProvider
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ResidualService (private val residualProvider: ResidualProvider) {

    fun create(requestResidualDTO: RequestResidualDTO): ResponseResidualDTO = ResponseResidualDTO(residualProvider.create(Residual((requestResidualDTO))))

    //read
    fun findAll(): List<ResponseResidualDTO> = residualProvider.findAll().map { ResponseResidualDTO(it) }

    //read
    fun findById(id: UUID): ResponseResidualDTO = ResponseResidualDTO(residualProvider.findById(id))

    fun update(id: UUID, requestResidualDTO: RequestResidualDTO): ResponseResidualDTO = ResponseResidualDTO(residualProvider.update(id, Residual(requestResidualDTO)))

    fun delete(id: UUID) = residualProvider.delete(id)
}