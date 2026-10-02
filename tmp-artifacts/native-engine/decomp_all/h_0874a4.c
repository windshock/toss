// entry=0x874a4

void H874a4(void)

{
  uint uVar1;
  long lVar2;
  long unaff_x29;
  
  uVar1 = -(int)DAT_00274480;
  lVar2 = (*(code *)(&DAT_0029e620)
                    [(long)(int)((uVar1 ^ 0x94f8c2f2) + (uVar1 & 0x94f8c2f2) * 2) * 0x2b +
                     (long)(int)(-0x6b073cfb - (-(int)DAT_00274480 ^ 0xffffffffU))])
                    (*(undefined8 *)(unaff_x29 + -0x130));
  if (lVar2 != 0) {
                    /* WARNING: Could not recover jumptable at 0x0017d414. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002780e8)();
    return;
  }
  uVar1 = -(int)DAT_00274480;
                    /* WARNING: Could not recover jumptable at 0x0018ce34. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00283a78)
            ((&DAT_0029e620)
             [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 0x2b +
              (long)(int)((uVar1 ^ 0x94f8c2fa) + (uVar1 & 0x94f8c2fa) * 2)]);
  return;
}


