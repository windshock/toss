// entry=0x86170

void H86170(void)

{
  uint uVar1;
  uint uVar2;
  undefined1 *puVar3;
  
  uVar1 = -(int)DAT_00274480;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar1 ^ 0x94f8c2f2) + (uVar1 & 0x94f8c2f2) * 2) * 0x2b +
             (long)(int)(-0x6b073d07 - (-(int)DAT_00274480 ^ 0xffffffffU))])();
  uVar1 = -(int)DAT_00274480;
  uVar2 = -(int)DAT_00274480;
  puVar3 = (undefined1 *)
           (*(code *)(&PTR_FUN_0027c1e0)
                     [(long)(int)((uVar1 ^ 0x94f8c2f2) + (uVar1 & 0x94f8c2f2) * 2) * 300 +
                      (long)(int)((uVar2 | 0x94f8c407) * 2 - (uVar2 ^ 0x94f8c407))])(4);
  *puVar3 = 0x31;
  puVar3[(-DAT_00274480 ^ 0x99bbd15a94f8c2f3U) + (-DAT_00274480 & 0x99bbd15a94f8c2f3U) * 2] = 0x30;
  puVar3[2] = (-(char)DAT_00274480 ^ 0x29U) + (-(char)DAT_00274480 & 0x29U) * '\x02';
                    /* WARNING: Could not recover jumptable at 0x0018b010. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&DAT_00281ad8)
            [(long)(int)((-(int)DAT_00274480 | 0x94f8c2f2U) * 2 - (-(int)DAT_00274480 ^ 0x94f8c2f2U)
                        ) * 0x6c])
            (puVar3 + ((-DAT_00274480 | 0x99bbd15a94f8c2f5U) * 2 -
                      (-DAT_00274480 ^ 0x99bbd15a94f8c2f5U)));
  return;
}


