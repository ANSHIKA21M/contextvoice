package com.contextvoice.contextvoice.controller;

import com.contextvoice.contextvoice.model.TextRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tts")
public class TextToSpeechController {

    @PostMapping
    public ResponseEntity<String> generateVoice(@RequestBody TextRequest request) {
        String inputText = request.getText();
        return ResponseEntity.ok("Voice generated for: " + inputText);
    }

}

