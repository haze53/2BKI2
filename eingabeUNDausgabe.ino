#include <Arduino.h>

char zeichen;

void setup() {
Serial.begin(9600);


}

void loop() {
Hardcode();

} 
 void Hardcode() {
  if(Serial.available() > 0){
  zeichen = Serial.read();

  if(zeichen == 49){
  Serial.println("Hallo");
  }else if(zeichen == 50){
    Serial.println("Tschüss");
  } else {
    Serial.println("Keine Mögliche eingabe");
  }
 }
}