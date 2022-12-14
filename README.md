วิธีการโหลดและการรันแอพพลิเคชั่น

อุปกรณ์และโปรแกรมที่ต้องใช้ทดสอบ
- Android Studio
- Mobile, Emulator ( Android )

สามารถแตกไฟล์แล้วใช้โปรแกรม Android Studio เปิดเพื่อรันทดสอบได้เลย

# รายละเอียดแต่ละ function ใน project weather


![Screenshot 2022-09-11 231310](https://user-images.githubusercontent.com/85951473/189537889-f691fc27-f23f-466d-9164-7ab95bbb0fd8.png)

หน้าจอนี้จะแสดงข้อมูลสภาพอากาศของเมืองหลวงแต่ละที่ที่ทำการค้นหาซึ่งจะตั้งค่าเริ่มต้นไว้ที่ Bangkok จะแสดงข้อมูลอย่างเช่น อุณหภูมิ, ค่าความชื้น, ความเร็วลม

![Screenshot 2022-09-11 230235](https://user-images.githubusercontent.com/85951473/189537440-f0311bf7-079c-4870-bd6d-9227f4f7265c.png)

ส่วนหน้าจอนี้จะเห็นได้ว่าจะมีปุ่มที่สามารถกดสลับรูปแบบการแสดงผลของตัวสภาพอากาศ เป็น celsius กับ fahrenheit

![image](https://user-images.githubusercontent.com/85951473/189537932-21fdbde2-4dcf-4abe-8a35-09e0f5a0d4d2.png)

ส่วนหน้าจอนี้จะเป็นการค้นหาเมืองหลวงของแต่ละที่โดยเราสามารถกรอกชื่อเมืองหลวงอะไรก็ได้

![image](https://user-images.githubusercontent.com/85951473/189537955-e9c60297-ae82-4509-b1a5-8c024bb61afc.png)

ส่วนหน้าจอนี้จะเป็นการค้นหาเมืองหลวงไม่เจอซึ่งจะแสดงข้อความ error ขึ้นมาในใต้ช่องที่ทำการค้นหา

![image](https://user-images.githubusercontent.com/85951473/189537967-e0c16dce-3123-4638-8980-847bcd90a6d8.png)

ส่วนหน้าจอนี้จะเป็นการค้นหาสำเร็จจะแสดงข้อมูลสภาพอากาศของเมืองหลวงนั้นๆตามที่เราค้นหา

![image](https://user-images.githubusercontent.com/85951473/189537985-6898b807-65f5-44d0-bcc5-c459884e38ff.png)

ส่วนหน้าจอนี้จะเป็นส่วนของพยากรณ์อากาศ forecast จะแสดงข้อมูลสภาพอากาศต่างๆ ระยะห่างที่แสดงผลจะเป็นทุก 3 ชั่วโมง ซึ่งปัจจุบันตอนนี้ตั้งไว้ 8 ช่วง

--- พยากรณ์อากาศ 7 วันข้างหน้า ---

![image](https://user-images.githubusercontent.com/85951473/189537830-2fae9db5-16b2-4aeb-aa74-edb492afcbe4.png)

สามารถใช้ api endpoint ตัวนี้ในการเรียกดูข้อมูลพยากรณ์อากาศ 7 วันข้างหน้า

ซึ่งสามารถเพิ่มเส้น api endpoint เส้นนี้ในตัว api interface แล้วทำการทำ usecase, repository ดึงข้อมูล แล้วสามารถ map กับตัว adapter ที่ทำไว้ได้เลยซึ่ง ui จะแสดงตามรูปที่อธิบายไว้ข้างบน
