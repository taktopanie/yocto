#include <QApplication>
#include <QLabel>
#include <QWidget>

int main(int argc, char *argv[])
{
    QApplication a(argc, argv);

    QLabel w("<center>HELLO WORLD?<center>");
    w.setWindowTitle("MYQT");
    w.resize(100,100);
   
    w.show();
    return a.exec();
}
