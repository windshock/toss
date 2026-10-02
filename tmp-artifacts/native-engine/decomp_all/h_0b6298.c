// entry=0xb6298

void HND_b64b8(void)

{
  uint uVar1;
  code *unaff_x23;
  undefined4 unaff_w24;
  
  (*unaff_x23)(unaff_w24);
  uVar1 = -(int)DAT_0027acf8;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(0x36dd8aa8 - (-(int)DAT_0027acf8 ^ 0xffffffffU)) * 300 +
             (long)(int)((uVar1 | 0x36dd8b5c) * 2 - (uVar1 ^ 0x36dd8b5c))])();
  uVar1 = -(int)DAT_0027acf8;
                    /* WARNING: Could not recover jumptable at 0x001b7d28. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027eb20)
            ((&DAT_0029e620)
             [(long)(int)(0x36dd8aa8 - (-(int)DAT_0027acf8 ^ 0xffffffffU)) * 0x2b +
              (long)(int)((uVar1 | 0x36dd8aaf) + (uVar1 & 0x36dd8aaf))]);
  return;
}


