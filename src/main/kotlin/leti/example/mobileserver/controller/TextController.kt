package leti.example.mobileserver.controller

import leti.example.mobileserver.model.UserInput
import leti.example.mobileserver.service.TextService
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/text")
@CrossOrigin(origins = ["*"])
class TextController(val textService: TextService) {
    private val logger = LoggerFactory.getLogger(javaClass)

    @PostMapping
    fun retrieveText(@RequestBody input: UserInput) {
        logger.info("Get text \"${input.text}\" from ${input.userId}")

        textService.saveUserInput(input)
    }
}