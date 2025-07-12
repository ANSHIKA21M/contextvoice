# 🎙️ ContextVoice – Java-Based Text-to-Speech System

ContextVoice is a Spring Boot application that takes user input and converts it into speech using the VoiceRSS API. The output is a `.mp3` file saved locally.

## 🔧 Tech Stack
- Java 17
- Spring Boot 3.x
- VoiceRSS TTS API
- REST API (JSON input/output)
- Postman (for testing)

## 🛠️ How to Run

1. Clone this repo
2. Copy `application.properties.example` → rename to `application.properties`
3. Add your VoiceRSS API key in that file

## 📬 Sample Request (POST)

```json
POST /api/tts
{
  "text": "Hello, this is ContextVoice!"
}
