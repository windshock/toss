// entry=0x85654

void H85654(char param_1)

{
  uint uVar1;
  uint uVar2;
  long unaff_x29;
  
  if (param_1 != (byte)(-0xf - (-(char)DAT_00274480 ^ 0xffU))) {
                    /* WARNING: Could not recover jumptable at 0x00182dbc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00280370)();
    return;
  }
  memset(*(void **)(unaff_x29 + -0x1b8),0,0x5c);
  uVar1 = -(int)DAT_00274480;
  uVar2 = -(int)DAT_00274480;
                    /* WARNING: Could not recover jumptable at 0x00187f24. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002795e8)
            (&PTR_FUN_0027c1e0 +
             (long)(int)((uVar1 | 0x94f8c2f2) + (uVar1 & 0x94f8c2f2)) * 300 +
             (long)(int)((uVar2 | 0x94f8c3b5) * 2 - (uVar2 ^ 0x94f8c3b5)));
  return;
}


