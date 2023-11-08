import os
import math
import struct


# Функція для запису результату у текстовому форматі
def writeResTxt(fName, result):
    with open(fName, 'w') as f:
        f.write(str(result))


# Функція для читання результату з текстового файлу
def readResTxt(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'r') as f:
                result = float(f.read())
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result


# Функція для запису результату у двійковому форматі
def writeResBin(fName, result):
    with open(fName, 'wb') as f:
        # Використовуємо struct.pack для збереження числа у двійковому форматі
        f.write(struct.pack('f', result))


# Функція для читання результату з двійкового файлу
def readResBin(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
                # Використовуємо struct.unpack для розпакування числа з двійкового формату
                result = struct.unpack('f', f.read())[0]
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result


# Функція для обчислення y=tan(x)
def calculate_tan(x):
    return math.tan(x)


# Головна частина програми
if __name__ == "__main__":
    # Зчитуємо вхідні дані від користувача (в радіанах)
    x = float(input("Enter value of x (in radians): "))

    try:
        # Обчислюємо результат
        result = calculate_tan(x)

        # Виводимо результат у консоль
        print(f"Result of tan(x) is: {result}")

        # Записуємо результат у текстовий файл
        writeResTxt("textRes.txt", result)

        # Записуємо результат у двійковий файл
        writeResBin("binRes.bin", result)

        # Читаємо результат із двійкового та текстового файлів та виводимо їх
        print(f"Result from binary file: {readResBin('binRes.bin')}")
        print(f"Result from text file: {readResTxt('textRes.txt')}")

    except Exception as e:
        # Виводимо повідомлення про будь-яку помилку
        print(f"An error occurred: {e}")
