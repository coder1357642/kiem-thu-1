# kiem-thu-1
BIT220037- Vũ Quang Dũng

Mô tả bài tập kiểm thử đơn vị với Java:

Trong bài toán kiểm thử này, chúng ta sẽ kiểm thử các phương thức cơ bản của lớp Calculator để đảm bảo rằng các phép toán được thực hiện đúng đắn. Cụ thể, các phép toán sẽ bao gồm cộng, trừ, nhân, chia và một số tình huống đặc biệt như chia cho 0, cộng với số âm, và kiểm tra trường hợp tràn số.

1. Phạm vi của bài toán

Bài toán kiểm thử sẽ tập trung vào việc kiểm tra các chức năng sau:

Phép cộng: add(int a, int b)

Phép trừ: subtract(int a, int b)

Phép nhân: multiply(int a, int b)

Phép chia: divide(int a, int b)

2. Các tình huống kiểm thử

Các tình huống kiểm thử (test cases) sẽ kiểm tra các trường hợp sau:

2.1. Kiểm thử phép cộng

Test 1: Kiểm tra phép cộng đơn giản với các số dương (add(2, 3)).

Test 2: Kiểm tra phép cộng với một số âm (add(-2, 1)).

Test 3: Kiểm tra phép cộng với các số lớn (add(1000000000, 1000000000)).

2.2. Kiểm thử phép trừ

Test 1: Kiểm tra phép trừ đơn giản với các số dương (subtract(3, 2)).

Test 2: Kiểm tra phép trừ với các số âm (subtract(-2, -1)).

2.3. Kiểm thử phép nhân

Test 1: Kiểm tra phép nhân với các số dương (multiply(2, 3)).

Test 2: Kiểm tra phép nhân với một số 0 (multiply(0, 5)).

2.4. Kiểm thử phép chia

Test 1: Kiểm tra phép chia đơn giản với các số dương (divide(6, 3)).

Test 2: Kiểm tra chia với tử số bằng 0 (divide(0, 5)).

Test 3: Kiểm tra chia cho 0 để xác nhận trường hợp ngoại lệ (divide(6, 0)).

2.5. Kiểm thử số lớn và tràn số

Test 1: Kiểm tra trường hợp tràn số khi cộng với số lớn (add(Integer.MAX_VALUE, 1)).

2.6. Kiểm thử tính toán liên kết (Integration Test)

Test 1: Kiểm tra tính toán liên kết giữa phép cộng và phép nhân (add(2, 3) rồi nhân với 2).

Ảnh chụp kết quả kiểm thử:

<img width="960" alt="anh kiem thu" src="https://github.com/user-attachments/assets/1491bf08-ad31-4f96-988b-b3f613b0d70b" />

Liên kết chatgpt: https://chatgpt.com/share/677baff7-0c80-800b-86d4-e13bcbafaf5b
