// entry=0x1377e4

void H1377e4(void)

{
  uint uVar1;
  uint uVar2;
  
  uVar1 = -(int)DAT_00279eb0;
  uVar2 = -(int)DAT_00279eb0;
                    /* WARNING: Could not recover jumptable at 0x00240560. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00277660)
            ((&PTR_FUN_0027c1e0)
             [(long)(int)((uVar1 | 0x8692046) + (uVar1 & 0x8692046)) * 300 +
              (long)(int)((uVar2 ^ 0x869212b) + (uVar2 & 0x869212b) * 2)]);
  return;
}


