// entry=0x85648

void H85648(void)

{
  uint uVar1;
  uint uVar2;
  undefined8 uVar3;
  long unaff_x29;
  
  uVar1 = -(int)DAT_00274480;
  uVar2 = -(int)DAT_00274480;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar2 | 0x94f8c2f2) * 2 - (uVar2 ^ 0x94f8c2f2)) * 0x2b +
             (long)(int)((uVar1 ^ 0x94f8c2fa) + (uVar1 & 0x94f8c2fa) * 2)])
            (*(undefined8 *)(unaff_x29 + -0x130));
  uVar1 = -(int)DAT_00274480;
  uVar2 = -(int)DAT_00274480;
  uVar3 = (*(code *)(&DAT_0029e620)
                    [(long)(int)((uVar2 ^ 0x94f8c2f2) + (uVar2 & 0x94f8c2f2) * 2) * 0x2b +
                     (long)(int)((uVar1 | 0x94f8c2f9) * 2 - (uVar1 ^ 0x94f8c2f9))])
                    (*(undefined8 *)(unaff_x29 + -0x130),&DAT_00279ef1);
                    /* WARNING: Could not recover jumptable at 0x0017ac1c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00276770)(uVar3,uVar3);
  return;
}


