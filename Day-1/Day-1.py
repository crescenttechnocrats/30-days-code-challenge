import qrcode

qr="https://github.com/LeCoupa/awesome-cheatsheets"

qr_gen=qrcode.make(qr)

qr_gen.save("Sample.jpg")
