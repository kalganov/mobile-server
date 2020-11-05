package leti.example.mobileserver.service

import leti.example.mobileserver.model.Input
import leti.example.mobileserver.model.UserInput
import leti.example.mobileserver.repo.InputRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.Instant
import java.time.ZonedDateTime
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import javax.transaction.Transactional


@Service
class TextService(@Autowired val inputRepo: InputRepo) {

    @Transactional
    fun saveUserInput(userInput: UserInput) {
        inputRepo.saveAll(userInput.symbolsToSpeed.asSequence()
                .map {
                    Input(
                            UUID.randomUUID(),
                            userInput.userId,
                            it.second,
                            it.first.first,
                            it.first.second,
                            ZonedDateTime.now())
                }.toList())
    }
}