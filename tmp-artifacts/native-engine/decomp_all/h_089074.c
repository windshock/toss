// entry=0x89074

void thunk_FUN_00187810(void)

{
  uint uVar1;
  undefined8 uVar2;
  long unaff_x19;
  long unaff_x22;
  long unaff_x29;
  
  uVar1 = -(int)DAT_00274480;
  uVar2 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar1 | 0x94f8c2f2) + (uVar1 & 0x94f8c2f2)) * 300 +
                     (long)(int)(-0x6b073bfa - (-(int)DAT_00274480 ^ 0xffffffffU))])
                    (unaff_x19 * 0x14);
  *(undefined8 **)(unaff_x29 + -0x150) = (undefined8 *)(unaff_x22 + 0xc);
  *(undefined8 *)(unaff_x22 + 0xc) = uVar2;
                    /* WARNING: Could not recover jumptable at 0x0018616c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_0027bdd8)
            [(long)(int)((-(int)DAT_00274480 | 0x94f8c2f2U) + (-(int)DAT_00274480 & 0x94f8c2f2U)) *
             0x6c])();
  return;
}


