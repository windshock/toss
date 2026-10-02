// entry=0x7fed8

void H7f4fc(void)

{
  uint uVar1;
  uint uVar2;
  undefined8 unaff_x21;
  undefined8 unaff_x25;
  long unaff_x29;
  
  *(undefined8 *)(unaff_x29 + -0xb8) = unaff_x21;
  *(undefined8 *)(unaff_x29 + -0xb0) = unaff_x25;
  memset(*(void **)(unaff_x29 + -0xa8),0,0x5c);
  uVar1 = -(int)DAT_00274480;
  uVar2 = -(int)DAT_00274480;
                    /* WARNING: Could not recover jumptable at 0x0018b8c0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00277698)
            ((&PTR_FUN_0027c1e0)
             [(long)(int)((uVar1 | 0x94f8c2f2) * 2 - (uVar1 ^ 0x94f8c2f2)) * 300 +
              (long)(int)((uVar2 | 0x94f8c3b5) + (uVar2 & 0x94f8c3b5))]);
  return;
}


