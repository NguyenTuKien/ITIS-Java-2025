# Usage
* Dùng `Run` hoặc `Debug` của IDE(Intellij hoặc VSCode).
* Dùng `terminal` và chạy lệnh sau:
    ```
    java A_plus/<TÊN FILE BẠN MUỐN CHẠY> <<< "<CÁC THÔNG TIN ĐẦU VÀO>"
    ```
* Các thông tin đầu vào:
  * Với `CreatePack`: Tên folder, sau đó là tên các class.
    * Ví dụ: `java A_plus/ZipLinux.java <<< "J07019 Item Bill"`
    * Hoặc có thể chạy code và nhập `J07019 Item Bill`.
    * Code trên sẽ tự tạo `Main.java` là chương trình chạy trính, bạn không cần tạo lại `Main`.
  * Với `ZipWindow` và `ZipLinux` (cho ai dùng Linux) thì chỉ cần nhập vào tên package cần zip.
    * Ví dụ: `java A_plus/ZipLinux.java <<< "J05066"`
> **Tip & Trick:**
>> Dùng với `teminal` có thể tối ưu về thao tác hơn vì vẫn có thế ở trang code đang code dở mà vẫn có thể tạo package mới hoặc zip package khác.

> **Các ngắt vào ra cho các bài nhập vô hạn Input:**
>> Nếu bạn dùng Intellij, sẽ có 2 cơ chế chạy là `Run` và `Debug`. 
>> * Nếu dùng `Debug`, dùng `Ctrl D` để ngắt vào ra.
>> * Nếu dùng `Run`, bấm vào nút 'Exit' (thứ 4 từ trái sang, bên cạnh máy ảnh).

> Các chạy code bằng Teminal.
>> Nếu chỉ có 1 class Main, chỉ cần chạy `java <TÊN FILE>`. Ví dụ: `java J01002.java`
>
>> Nếu chứa nhiều class, cần `javac` để build sau đó dùng `java` để chạy. 
>> 
>> Ví dụ: `javac J07051/*.java && java J07051/Main.java` 

_**<center>Chúc anh em thi tốt !!!</center>**_
  