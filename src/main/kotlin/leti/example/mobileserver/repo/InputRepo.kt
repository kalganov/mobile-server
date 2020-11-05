package leti.example.mobileserver.repo

import leti.example.mobileserver.model.Input
import org.springframework.data.repository.CrudRepository
import java.util.*

interface InputRepo : CrudRepository<Input, UUID> {
}