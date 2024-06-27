package jornadadeaprendizagem.renault.modules.providers

import jornadadeaprendizagem.renault.models.entities.Residual
import jornadadeaprendizagem.renault.modules.repositories.ResidualRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class ResidualProvider (private val residualRepository: ResidualRepository) {

    fun create(residual : Residual): Residual {
        return residualRepository.save(residual)
    }

    //read
    fun findAll(): List<Residual> {
        return residualRepository.findAll()
    }

    //read
    fun findById(id: UUID): Residual {
        return residualRepository.findById(id).orElseThrow()
    }

    fun update(id: UUID, residual : Residual): Residual {
        return residualRepository.save(residual)
    }

    fun delete(id: UUID){
        return residualRepository.deleteById(id)
    }
}