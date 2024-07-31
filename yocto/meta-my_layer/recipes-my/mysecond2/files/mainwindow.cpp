#include "mainwindow.h"
#include "ui_mainwindow.h"

int zmienna = 0;

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::on_pushButton_clicked()
{
    if(zmienna == 0)
    {
         ui->pushButton->setText("CLICKED");
        zmienna++;
    }else
    {
        ui->pushButton->setText("TOGGLE");
        zmienna = 0;
    }

}

