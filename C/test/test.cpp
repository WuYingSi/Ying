#include<stdio.h>
#include<conio.h>
#include<graphics.h>
int main()
{
    float ballx, bally, r, vy;
    float fx, width, fh, vx;
    float k = 600, h = 400, g = 0.7;
    int score;
    score = 0;
    initgraph(k, h);
    r = 20;
    ballx = k / 4;
    bally = h - r, vy = 0;
    fh = 100;
    width = 20;
    fx = k * 3 / 4;
    vx = -3;
    int isk = 0;
    while (1) {
        if (kbhit()) {
            char input = _getch();
            if (input == ' ' && isk == 0) {
                vy = -19;
                isk = 1;
            }
        }
        vy = vy + g;
        bally = bally + vy;
        if (bally >= h - r) {
            bally = h - r;
            vy = 0;
            isk = 0;
        }
        fx = fx + vx;
        if (fx <= 0) {
            fx = k;
            score = score + 1;
            fh = rand() % int(h / 4) + h / 4;
            vx = rand() / float(RAND_MAX) * 4 - 7;
        }
        if ((fx <= ballx + r) && (bally + r >= h - fh) && (ballx - r <= fx - width)) {
            score = 0;
            Sleep(100);
        }
        cleardevice();
        fillcircle(ballx, bally, r);
        fillrectangle(fx, h - fh, fx + width, h);
        TCHAR s[20];
        _stprintf(s, _T("%d"), score);
        settextstyle(40, 0, _T("ËÎÌו"));
        outtextxy(50, 30, s);
        Sleep(10);
    }
    closegraph();
    return 0;
}