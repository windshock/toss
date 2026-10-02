// entry=0x8b400

void H8b400(void)

{
  char cVar1;
  uint uVar2;
  uint uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  code *pcVar6;
  undefined8 uVar7;
  char *unaff_x27;
  long unaff_x29;
  
  uVar2 = -(int)DAT_00274480;
  uVar7 = *(undefined8 *)(unaff_x29 + -0x130);
  uVar4 = (*(code *)(&DAT_0029e620)
                    [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 0x2b +
                     (long)(int)((uVar2 | 0x94f8c304) * 2 - (uVar2 ^ 0x94f8c304))])(uVar7);
  uVar2 = -(int)DAT_00274480;
  uVar5 = (*(code *)(&DAT_0029e620)
                    [(long)(int)((uVar2 | 0x94f8c2f2) + (uVar2 & 0x94f8c2f2)) * 0x2b +
                     (long)(int)(-0x6b073ce5 - (-(int)DAT_00274480 ^ 0xffffffffU))])(uVar7,uVar4);
  uVar2 = -(int)DAT_00274480;
  pcVar6 = (code *)(&DAT_0029e620)
                   [(long)(int)((uVar2 ^ 0x94f8c2f2) + (uVar2 & 0x94f8c2f2) * 2) * 0x2b +
                    (long)(int)(-0x6b073cfa - (-(int)DAT_00274480 ^ 0xffffffffU))];
  *(undefined8 *)(unaff_x29 + -0x2e8) = uVar5;
  uVar5 = (*pcVar6)(uVar7,uVar5,&DAT_00279fe8,&DAT_00279f13);
  uVar2 = -(int)DAT_00274480;
  uVar3 = -(int)DAT_00274480;
  pcVar6 = (code *)(&DAT_0029e620)
                   [(long)(int)((uVar2 ^ 0x94f8c2f2) + (uVar2 & 0x94f8c2f2) * 2) * 0x2b +
                    (long)(int)((uVar3 | 0x94f8c300) * 2 - (uVar3 ^ 0x94f8c300))];
  *(undefined8 *)(unaff_x29 + -0x2d0) = uVar4;
  uVar4 = (*pcVar6)(uVar7,uVar4,uVar5);
  uVar2 = -(int)DAT_00274480;
  uVar3 = -(int)DAT_00274480;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar3 | 0x94f8c2f2) + (uVar3 & 0x94f8c2f2)) * 0x2b +
             (long)(int)((uVar2 | 0x94f8c319) * 2 - (uVar2 ^ 0x94f8c319))])(uVar7,uVar4,0);
  do {
    cVar1 = *unaff_x27;
    unaff_x27 = unaff_x27 + (-0x66442ea56b073d0e - (-DAT_00274480 ^ 0xffffffffffffffffU));
  } while (cVar1 != '\0');
                    /* WARNING: Could not recover jumptable at 0x0018a62c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027d358)();
  return;
}


