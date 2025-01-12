# kiem-thu-1
BIT220037- Vũ Quang Dũng

Mô tả bài tập kiểm thử đơn vị với Java:

Lớp Calculator
Lớp này cung cấp các phương thức thực hiện các phép toán cơ bản:

add(double a, double b): Phép cộng hai số.
subtract(double a, double b): Phép trừ hai số.
multiply(double a, double b): Phép nhân hai số.
divide(double a, double b): Phép chia hai số, với điều kiện mẫu số phải khác 0.
Nếu mẫu số bằng 0, phương thức divide sẽ ném ra ngoại lệ IllegalArgumentException.

Lớp kiểm thử CalculatorTest
Lớp kiểm thử này sử dụng các phương thức của JUnit 5 để kiểm tra từng phương thức của lớp Calculator. Các phần chính:

Kiểm thử phương thức add:

Kiểm tra các trường hợp tổng quát như cộng số dương, âm, 0.
Đảm bảo kết quả phép cộng là chính xác.
Kiểm thử phương thức subtract:

Tương tự như phép cộng, kiểm tra các trường hợp phổ biến với số dương, âm và 0.
Kiểm thử phương thức multiply:

Kiểm tra các trường hợp số nhân, bao gồm cả số âm và 0.
Đảm bảo nhân với 0 luôn trả về 0.
Kiểm thử phương thức divide:

Kiểm tra chia thông thường, chia số âm, chia với 0 ở tử số.
Xác minh rằng chia cho 0 (mẫu số) ném ngoại lệ IllegalArgumentException.
Kiểm thử tích hợp (testAdditionAndMultiplicationIntegration):

Kiểm tra tích hợp giữa hai phương thức add và multiply.
Đảm bảo rằng kết quả của một phép tính (cộng) được sử dụng đúng trong phép tính khác (nhân).
Cách thực hiện
Để chạy bài kiểm thử, bạn cần có thư viện JUnit 5 trong dự án.
Biên dịch và chạy các bài kiểm thử bằng cách sử dụng IDE như IntelliJ IDEA, Eclipse hoặc chạy trực tiếp bằng Maven/Gradle.
Kết quả mong đợi
Tất cả bài kiểm thử phải "pass" nếu các phương thức trong lớp Calculator hoạt động đúng.
Các ngoại lệ (IllegalArgumentException) phải được ném ra chính xác khi chia cho 0.
Ý nghĩa của bài tập
Giúp nắm vững cách viết unit test với JUnit.
Đảm bảo chất lượng mã bằng cách phát hiện lỗi trong quá trình phát triển.
Khuyến khích kiểm thử cả những trường hợp biên và ngoại lệ.

Ảnh chụp kết quả kiểm thử:
![Screenshot (29)](https://github.com/user-attachments/assets/3b1aeebe-6f75-406d-9cd2-c434e7a48d83)

