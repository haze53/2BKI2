#include <Arduino.h>

#define LED_BUILTIN 2


void blinken(int frequenz);

void setup() {
  pinMode(LED_BUILTIN, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  for (int frequenz = 1; frequenz <= 10; frequenz++) {
    Serial.print("Blinkfrequenz: ");
    Serial.print(frequenz);
    Serial.print(" Hz\n");

    for (int i = 0; i < frequenz; i++) {
      blinken(frequenz);
    }
  }
}


void blinken(int frequenz) {
  int per = 500 / frequenz;

  digitalWrite(LED_BUILTIN, HIGH);
  delay(per);
  digitalWrite(LED_BUILTIN, LOW);
  delay(per);
}